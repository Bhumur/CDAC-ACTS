package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.type.Saving;
import com.cdac.acts.util.DataEntry;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		List<Account> accountList = new ArrayList<Account>(); 
		do {
			
			System.out.println("OPTIONS:-");
			System.out.println("1. Add Account.");
			System.out.println("2. Display All Account.");
			System.out.println("3. Create UNMODIFIABLE from existind List.");
			System.out.println("4. Use Upper Bound.");
			System.out.println("5. Use Lower Bound.");
			System.out.println("0. EXIT");
			System.out.print("\nEnter Your Choice : ");
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					System.out.println("_____ADD ACCOUNT_____");
					accountList.add(DataEntry.listAccountDetails());
					System.out.println("Account Added : " + accountList.get(accountList.size()-1));
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
					System.out.println("_____MAKE UNMODIFIABLE_____");
					accountList = Collections.unmodifiableList(accountList);
					System.out.println("accountList is made unmodifiablelList");
					break;
				}
				case 4: {
					System.out.println("_____EXTENDS UPPER BOUND_____");
					Iterator<? extends Account> itr = accountList.listIterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
					break;
				}
				case 5: {
					System.out.println("_____SUPER LOWER BOUND_____");
					Iterator<? super Saving> itr = accountList.listIterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
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
