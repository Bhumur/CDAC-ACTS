package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.cdac.acts.util.Date;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Current;
import com.cdac.acts.account.type.FixDeposite;
import com.cdac.acts.account.type.Saving;
import com.cdac.acts.enums.AccountTypeEnum;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account []acc = new Account[20];
		int index = 0;
		int op;
		AccountTypeEnum types = AccountTypeEnum.valueOf("S");
		AccountTypeEnum typec = AccountTypeEnum.valueOf("C");
		AccountTypeEnum typef = AccountTypeEnum.valueOf("FD");
		do {
			options();
			op = sc.nextInt();
			switch(op) {
				case 1: {
					System.out.println("_______________ADDING SAVING ACCOUNT____________________");
					System.out.print("Enter Name of Saving Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balance Saving Accout Holder : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Saving(name,dateofopening,bal,types);
					System.out.println("Saving Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 2: {
					System.out.println("_______________ADDING CURRENT ACCOUNT____________________");
					System.out.print("Enter Name of Current Accout Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Opening Balance Current Accout Holder : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					acc[index] = new Current(name,dateofopening,bal,typec);
					System.out.println("Current Account is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 3: {
					System.out.println("_______________ADDING FIX DEPOSIT____________________");
					System.out.print("Enter Name of Fixed Deposite Holder : ");
					String name = sc.next();
					System.out.print("Enter Opening Date in formate dd/mm/yyyy Formate : ");
					String strdateofopening = sc.next();
					System.out.print("Enter Maturatiy Date in formate dd/mm/yyyy Formate : ");
					String strmaturitydate = sc.next();
					System.out.print("Enter Fixed Deposite Amount : ");
					double bal = sc.nextDouble();
					LocalDate dateofopening = Date.stringToDate(strdateofopening);
					LocalDate maturitydate = Date.stringToDate(strmaturitydate);
					acc[index] = new FixDeposite(name,maturitydate,dateofopening,bal,typef);
					System.out.println("Fix Deposite is Added");
					System.out.println(acc[index].toString());
					index++;
					break;
				}
				case 4: {
					System.out.println("_______________DEPOSITE____________________");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					int flag=0;
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							flag =1;
							if(acc[i].getType() == typef) {
								System.out.println("ACCOUNT HOLDER IS FIX DEPOSITE ACCOUNT, SO NO DEPOSITE AND NO WITHDREW");
							}
							else if(acc[i].getType() == types) {
								System.out.print("Enter Amount to be Deposite : ");
								int ammount = sc.nextInt();
								Saving s = (Saving)acc[i];
								s.depoist(ammount);
							}
							else {
								System.out.print("Enter Amount to be Deposite : ");
								int ammount = sc.nextInt();
								Current c = (Current)acc[i];
								c.depoist(ammount);
							}
						}
					}
					if(flag==0) {
						System.out.println("ACCOUNT NOT FOUND");
					}
					break;
				}
				case 5: {
					System.out.println("_______________WITHDREW____________________");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					int flag=0;
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							flag =1;
							if(acc[i].getType() == typef) {
								System.out.println("ACCOUNT HOLDER IS FIX DEPOSITE ACCOUNT, SO NO DEPOSITE AND NO WITHDREW");
							}
							else if(acc[i].getType() == types) {
								System.out.print("Enter Amount to be WithDrew : ");
								int ammount = sc.nextInt();
								Saving s = (Saving)acc[i];
								s.withdraw(ammount);
							}
							else {
								System.out.print("Enter Amount to be WithDrew : ");
								int ammount = sc.nextInt();
								Current c = (Current)acc[i];
								c.withdraw(ammount);
							}
						}
					}
					if(flag==0) {
						System.out.println("ACCOUNT NOT FOUND");
					}
					break;
				}
				case 6: {
					System.out.println("_______________MATURAITY AMMOUNT____________________");
					System.out.print("Enter Account Number : ");
					int accno = sc.nextInt();
					int flag=0;
					for(int i=0;i<index;i++) {
						if(acc[i].getAccountNumber()==accno) {
							flag =1;
							if(acc[i].getType() == typef) {
								FixDeposite f = (FixDeposite)acc[i];
								System.out.println(f.calculateMatutyAmount());
							}
							else {
								System.out.println("ACCOUNT HOLDER IS NOT FIX DEPOSITE ACCOUNT");
							}
						}
					}
					if(flag==0) {
						System.out.println("ACCOUNT NOT FOUND");
					}
					break;
				}
				case 7: {
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
		System.out.println("2. Add Current Account");
		System.out.println("3. Add Fixed Deposite");
		System.out.println("4. Deposit");
		System.out.println("5. Withdrew");
		System.out.println("6. Muturity intrest of FD");
		System.out.println("7. Display All Accounts");
		System.out.println("\nEnter Your Choice : ");
	}

}
