package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.cdac.acts.utils.Date;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Current;
import com.cdac.acts.account.type.Saving;

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
					System.out.print("Enter Name of Saving Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balance Saving Accout Holder : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Saving(name,dateofopening,bal);
					System.out.println("Saving Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 2: {
					System.out.print("Enter Name of Current Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balance Current Accout Holder : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Current(name,dateofopening,bal);
					System.out.println("Current Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 3: {
					System.out.print("Enter Name of Deposit Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balance Deposit Accout Holder : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Current(name,dateofopening,bal);
					System.out.println("Deposit Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 4: {
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					String s = "";
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							s = "Intrest of " + acc[i].getAccountNumber() + " is " + (1+acc[i].applyInterst())*acc[i].getBalcance();
						}
					}
					if(s.length()!=0) {
						System.out.println(s);
					}
					else {
						System.out.println("INVALID ACCOUNT NUMBER");
					}
					break;
				}
				case 5: {
					for(int i=0;i<index;i++) {
						for(int j=i+1;j<index;j++) {
							if(acc[i].getBalcance()>acc[j].getBalcance()) {
								Account a = acc[i];
								acc[i] = acc[j];
								acc[j] = a;
							}
						}
					}
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
		System.out.println("2. Add Current Account");
		System.out.println("3. Add Deposit Account");
		System.out.println("4. Intrest of Account");
		System.out.println("5. Sort Accounts");
		System.out.println("0. EXIT");
		System.out.println("\nEnter Your Choice : ");
	}

}
