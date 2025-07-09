package com.cdac.acts.tester;


import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;


import java.util.List;
import java.util.Scanner;

import com.cdac.acts.util.Date;
import com.cdac.acts.validation.DateValidation;

import com.cdac.acts.account.Account;
import com.cdac.acts.exception.DateExeption;
import com.cdac.acts.exception.MinBalanceException;
import com.cdac.acts.util.DataEntry;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		List<Account> accountList = DataEntry.listAccountDetails(); 
		do {
			
			System.out.println("OPTIONS:-");
			System.out.println("1. Add Account.");
			System.out.println("2. Display All Account.");
			System.out.println("3. Sort by account no desc.");
			System.out.println("4. Sort by accName.");
			System.out.println("5. Sort by Date of opening.");
			System.out.println("6. Sort by balance desc.");
			System.out.println("0. EXIT");
			System.out.print("\nEnter Your Choice : ");
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					System.out.println("_____ADD ACCOUNT_____");
					System.out.println("Enter Name : ");
					String name = sc.next();
					LocalDate dateofjoin=null;
					do {
						try {
							System.out.println("Enter Date of joining in formate dd/mm/yyyy : ");
							String strdate = sc.next();
							dateofjoin = Date.strToLocalDate(strdate);
						}catch (Exception e) {			
							System.out.println("Invalid Formate");
							continue;
						}
						try {
							if(DateValidation.datevalid(dateofjoin)==null) {
								throw new DateExeption("Date INVALID"); 
							}
						}
						catch (DateExeption e) {			
							System.out.println(e.getMessage());
							continue;
						}
					}while(dateofjoin==null);
					Double bal = null;
					try {
						System.out.println("Enter Opening Balance : ");
						bal = sc.nextDouble();
						if(bal<=1000) {
							throw new MinBalanceException("Mininmum Balace Exception"); 
						}
					}
					catch (MinBalanceException e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					} 
					accountList.add(new Account(name, dateofjoin, bal));
					
					break;
				}
				case 2: {
					System.out.println("_____Display All ACCOUNT_____");
					for(Account a : accountList) {
						System.out.println(a);
					}
					break;
				}
				case 3: {
					System.out.println("_____Sort by account no desc_____");
					Collections.sort(accountList);
					break;
				}
				case 4: {
					System.out.println("_____Sort by accName_____");
					Collections.sort(accountList, new Comparator<Account>() {
						@Override
						public int compare(Account a, Account b) {
							return a.getName().compareTo(b.getName());
						}
					});
					break;
				}
				case 5: {
					System.out.println("_____Sort by Date of opening_____");
					Collections.sort(accountList, new Comparator<Account>() {
						@Override
						public int compare(Account a, Account b) {
							return a.getDateOfOpening().compareTo(b.getDateOfOpening());
						}
					});
					break;
				}
				case 6: {
					System.out.println("_____Sort by balance desc_____");
					Collections.sort(accountList, new Comparator<Account>() {
						@Override
						public int compare(Account a, Account b) {
							return b.getBalance().compareTo(a.getBalance());
						}
					});
					break;
				}
				case 0: break;
				default: System.out.println("INVALID INPUT");
			}
			
			
			
		}while(op!=0);
		sc.close();
	}

}
