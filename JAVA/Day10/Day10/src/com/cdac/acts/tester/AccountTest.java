package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.cdac.acts.util.Date;

import com.cdac.acts.account.Account;
import com.cdac.acts.exception.MinBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account []acc = new Account[20];
		int index = 0;
		int op;
		do {
			options();
			op = sc.nextInt();
			switch(op) {
				case 1: {
					System.out.println("_______________ADDING ACCOUNT____________________");
					System.out.print("Enter Name of Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balanceof Accout : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Account(name,dateofopening,bal);
					System.out.println("Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 2: {
					System.out.println("_______________DEPOSITE____________________");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					int flag=0;
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							flag =1;
							System.out.print("Enter Amount to be Deposite : ");
							int ammount = sc.nextInt();
							acc[i].setBalcance(acc[i].getBalcance()+ammount);
							System.out.println("Balance is Deposited");
							}
						}
					if(flag==0) {
						System.out.println("ACCOUNT NOT FOUND");
					}
					break;
				}
				case 3: {
					System.out.println("_______________WITHDREW____________________");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					int flag=0;
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							flag =1;
							System.out.print("Enter Amount to be WithDrew : ");
							int ammount = sc.nextInt();
							try {
								acc[i].withDrew(ammount);
							}
							catch (MinBalanceException e) {
								e.printStackTrace();
								System.out.println(e.getMessage());
							}
						}
						if(flag==0) {
							System.out.println("ACCOUNT NOT FOUND");
						}
					}
					break;
				}
				case 4: {
					System.out.println("_______________DISPLAY ALL ACCOUNTS____________________");
					for(int i=0;i<index;i++) {
						System.out.println(acc[i].toString());
					}
					break;
				}
				case 0: break;
				default: System.out.println("INVALID INPUT");
			}
			
		}while(op!=0);
		sc.close();
	}

	private static void options() {
		System.out.println("OPTIONS :-");
		System.out.println("1. Add Saving Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdrew");
		System.out.println("4. Display All Accounts");
		System.out.println("0. EXIT");
		System.out.println("\nEnter Your Choice : ");
	}

}
