package com.cdac.acts.Tester;

import java.util.Scanner;
import com.cdac.acts.account.Account;

public class AccountTest {
	
	public static void option() {
		System.out.print("1.     Add account\r\n"
				+ "2.     Display balance of particular\r\n"
				+ "3.	  Deposit\r\n"
				+ "4.     Withdraw\r\n"
				+ "5.     Transfer\r\n"
				+ "6.     Display All\r\n"
				+ "0.     Exit\r\n"
				+ "\n"
				+ "Enter Your Choice : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Account Array : ");
		int n = sc.nextInt();
		
		Account []acc = new Account[n];
		
		int op,x=0;
		
		do {
			option();
			op = sc.nextInt();
			switch(op) {
				case 1:	{
					System.out.println("\n---------ADD ACCOUNT--------------\n");
					if(x<n) {
						System.out.print("Enter Name Of Account Holder : ");
						String name  = sc.next();
						acc[x] = new Account(name);
						System.out.println("\nAccount Succesfully Added\n");
						System.out.println(acc[x].toString());
						x++;
					}
					else {
						System.out.println("Account Can't be add Because Array is full");
					}
					break;
				}
				case 2: {
					System.out.println("\n---------FIND ACCOUNT--------------\n");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					String s = "";
					for(int i=0;i<x;i++) {
						if(acc[i].getAccno() == accno) {
							s = acc[i].toString();
						}
					}
					if(s.length()>0) {
						System.out.println(s);
					}
					else {
						System.out.println("ACCOUNT NUMBER NOT EXIST");
					}
					break;
				}
				case 3: {
					System.out.println("\n---------DEPOSITE--------------\n");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					String s = "";
					for(int i=0;i<x;i++) {
						if(acc[i].getAccno() == accno) {
							System.out.print("Enter Amount To Be Deposit : ");
							double bal = sc.nextDouble();
							acc[i].setBalance(bal);
							s = acc[i].toString();
						}
					}
					if(s.length()==0) {
						System.out.println("ACCOUNT NUMBER NOT EXIST");
					}
					break;
				}
				case 4 : {
					System.out.println("\n---------WITHDREW--------------\n");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					String s = "";
					for(int i=0;i<x;i++) {
						if(acc[i].getAccno() == accno) {
							System.out.print("Enter Amount To Be Withdrew : ");
							double bal = sc.nextDouble();
							s = acc[i].toString();
							if(bal<acc[i].getBalance()) {
								acc[i].setBalance(acc[i].getBalance() - bal);
								System.out.println("\nWithDrew Successfully\n");
							}
							else {
								System.out.println("\nLOW BALANCE WITHDERW CAN'T BE DONE\n");
							}
							
						}
					}
					if(s.length()==0) {
						System.out.println("ACCOUNT NUMBER NOT EXIST");
					}
					break;
				}
				case 5 : {
					System.out.println("\n---------TRANSFER--------------\n");
					System.out.print("Enter PAYER Account Number : ");
					int accno1 = sc.nextInt();
					System.out.print("Enter RECIVER Account Number : ");
					int accno2 = sc.nextInt();
					int a=-1,b=-1;
					for(int i=0;i<x;i++) {
						if(acc[i].getAccno() == accno1) {
							a=i;
						}
					}
					for(int i=0;i<x;i++) {
						if(acc[i].getAccno() == accno2) {
							b=i;
						}
					}
					if(a==-1) {
						System.out.println("INVALID PAYER");
					}
					else if(b==-1) {
						System.out.println("INVALID RESEVER");
					}
					else {
						System.out.print("Enter amount to be transefer : ");
						double bal = sc.nextDouble();
						if(acc[a].getBalance()>bal) {
							acc[a].setBalance(acc[a].getBalance()-bal);
							acc[b].setBalance(acc[b].getBalance()+bal);
							System.out.println("TRANSFER DONE SUCCESFULLY");
							acc[a].toString();
							acc[b].toString();
						}
						else {
							System.out.println("LOW BALANCE IN PAYER ACCOUNT");
						}
					}
					break;
				}
				case 6: {
					System.out.println("\n---------DISPLAY ALL--------------\n");
					for(int i=0;i<x;i++) {
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

}
