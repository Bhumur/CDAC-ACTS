package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import com.cdac.acts.util.DataEntry;
import com.cdac.acts.util.Date;
import com.cdac.acts.validation.DateValidation;
import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Current;
import com.cdac.acts.account.type.Saving;
import com.cdac.acts.exception.AccountFound;
import com.cdac.acts.exception.DateExeption;
import com.cdac.acts.exception.MinBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Account> accounts = DataEntry.listAccountDetails();
			int op;
			do {
				options();
				op = sc.nextInt();
				switch(op) {
					case 1: {
						System.out.println("_______________ADDING SAVING ACCOUNT____________________");
						System.out.print("Enter Name of Saving Accout Holder : ");
						String name = sc.next();
						LocalDate dateofjoin=null;
						while(dateofjoin==null){
							try {
								System.out.println("Enter Date of joining in formate dd/mm/yyyy : ");
								String strdate = sc.next();
								dateofjoin = Date.stringToDate(strdate);
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
								dateofjoin = null;
								continue;
							}
						}
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
						accounts.add(new Saving(name,dateofjoin,bal));
						System.out.print("Saving Account is Added : ");
						System.out.println(accounts.get(accounts.size()-1).toString());
						break;
					}
					case 2: {
						System.out.println("_______________ADDING CURRENT ACCOUNT____________________");
						System.out.print("Enter Name of Current Accout Holder : ");
						String name = sc.next();
						LocalDate dateofjoin=null;
						while(dateofjoin==null){
							try {
								System.out.println("Enter Date of joining in formate dd/mm/yyyy : ");
								String strdate = sc.next();
								dateofjoin = Date.stringToDate(strdate);
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
								dateofjoin = null;
								continue;
							}
						}
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
						accounts.add(new Current(name,dateofjoin,bal));
						System.out.print("Current Account is Added : ");
						System.out.println(accounts.get(accounts.size()-1).toString());
						break;
					}
					case 3: {
						System.out.println("_______________Display All Account____________________");
						for(Account a : accounts) {
							System.out.println(a.toString());
						}
						break;
					}
//					case 4: {
//						System.out.println("_______________Check Account Persent or Not____________________");
//						System.out.print("Enter Account Number to be Find : ");
//						int accNo = sc.nextInt();
//						try {
//							isAccountPresent(accounts, accNo);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						break;
//					}
//					case 5: {
//						System.out.println("_______________DEPOSITE____________________");
//						System.out.print("Enter Account Number : ");
//						int accNo = sc.nextInt();
//						Account a = null;
//						try {
//							a = isAccountPresent(accounts, accNo);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						System.out.print("Enter Amount to Be Deposit : ");
//						double amo = sc.nextDouble();
//						if(a instanceof Saving) {
//							((Saving) a).depoist(amo);
//						}
//						else {
//							((Current) a).depoist(amo);
//						}
//						break;
//					}
//					case 6: {
//						System.out.println("_______________WITHDREW____________________");
//						System.out.print("Enter Account Number : ");
//						int accNo = sc.nextInt();
//						Account a = null;
//						try {
//							a = isAccountPresent(accounts, accNo);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						System.out.print("Enter Amount to Be Withdrew : ");
//						double amo = sc.nextDouble();
//						try {
//							if(a instanceof Saving) {
//								((Saving) a).withdraw(amo);
//							}
//							else {
//								((Current) a).withdraw(amo);
//							}
//						}catch (MinBalanceException e) {
//							System.out.println(e);
//						}
//						break;
//					}
//					case 7: {
//						System.out.println("_______________Transfer____________________");
//						System.out.print("Enter Account Number of Payer : ");
//						int accNo1 = sc.nextInt();
//						Account a = null;
//						try {
//							a = isAccountPresent(accounts, accNo1);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						System.out.print("Enter Account Number of Reciver : ");
//						int accNo2 = sc.nextInt();
//						Account b = null;
//						try {
//							b = isAccountPresent(accounts, accNo2);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						System.out.print("Enter Amount to Be Transefer : ");
//						double amo = sc.nextDouble();
//						try {
//							if(a instanceof Saving) {
//								((Saving) a).withdraw(amo);
//							}
//							else {
//								((Current) a).withdraw(amo);
//							}
//						}catch (MinBalanceException e) {
//							System.out.println(e);
//						}
//						if(b instanceof Saving) {
//							((Saving) b).depoist(amo);
//						}
//						else {
//							((Current) b).depoist(amo);
//						}
//						break;
//					}
					case 8: {
						System.out.println("_______________Remove____________________");
						System.out.print("Enter Account Number to be Find : ");
						int accNo = sc.nextInt();
						for(Account a : accounts) {
							if(a.getAccountNumber()==accNo) {
								System.out.println(a);
								accounts.remove(a);
							}
						}
//						for(Account a : accounts) {
//							
//								System.out.println(a);
//							
//						}
//						Account a = null;
//						try {
//							a = isAccountPresent(accounts, accNo);
//						}catch (AccountFound e) {
//							System.out.println(e);
//						}
//						if(accounts.remove(a)) {
//							System.out.println("Account SuccessFully Remove");
//						}
						break;
					}
					case 9: {
						System.out.println("_______________Apply Intrest to Saving Accounts____________________");
						
						for(Account a : accounts) {
							if(a instanceof Saving) {
								((Saving) a).applyInterst();
							}
						}
						
						for(Account a : accounts) {
							System.out.println(a);
						}
						break;
					}
					case 10: {
						System.out.println("_______________Sort According to Account Number____________________");
						Collections.sort(accounts);
						break;
					}
					case 11: {
						System.out.println("_______________Sort According to Opening Date____________________");
						Collections.sort(accounts, new Comparator<Account>() {

							@Override
							public int compare(Account o1, Account o2) {
								return o1.getDateOfOpening().compareTo(o2.getDateOfOpening());
							}
							
						});
						break;
					}
					case 0: break;
					default: System.out.println("INVALID INPUT");
				}
				
			}while(op!=0);
		}
	}

	public static Account isAccountPresent(CopyOnWriteArrayList<Account> accounts, int accNo) throws AccountFound {
		for(Account a : accounts) {
			if(accNo == a.getAccountNumber()) {
				System.out.println(a.toString());
				return a;
			}
		}
		throw new AccountFound("AccountNotFoundException");
	}

	private static void options() {
		System.out.println("OPTIONS :-");
		System.out.println("1. Add Saving Account");
		System.out.println("2. Add Current Account");
		System.out.println("3. Display");
		System.out.println("4. Find Account");
		System.out.println("5. Deposit");
		System.out.println("6. Withdrew");
		System.out.println("7. Transfer");
		System.out.println("8. Remove");
		System.out.println("9. Apply Intrest to Savings Account");
		System.out.println("10. Sort According to Account Number");
		System.out.println("11. Sort According to Opening Date");
		System.out.println("0. Exit");
		System.out.println("\nEnter Your Choice : ");
	}

}
