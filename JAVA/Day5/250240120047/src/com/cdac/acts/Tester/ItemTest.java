package com.cdac.acts.Tester;

import java.util.Scanner;
import com.cdac.acts.item.Item;

public class ItemTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--------------------SET STOCK------------------------\n");
		
		
		System.out.print("Enter Number of items in stock : ");
		int n = sc.nextInt();
		
		Item []ItemStock = new Item[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Name of "+(i+1)+" Item : ");
			String itemname = sc.next();
			System.out.print("Enter Price of "+(i+1)+" Item : ");
			double price = sc.nextDouble();
			System.out.print("Enter Quantity of "+(i+1)+" Item : ");
			int qty = sc.nextInt();
			ItemStock[i] = new Item(itemname,price,qty);
			System.out.println(ItemStock[i].toString());
		}
		
		System.out.println("\n--------------------FOR CUSTOMER------------------------\n");
		
		
		Item []ItemList = new Item[15];
		int x=0;
		double bill = 0;
		int op;
		do {
			
			System.out.print("1.     Display stock\r\n"
					+ "2.     BUY item by item code\r\n"
					+ "3.     Display bill\r\n"
					+ "0.	  Exit\n"
					+ "\nEnter your choice : "
					);
			op = sc.nextInt();
			switch(op) {
				case 1: {
					System.out.println("=======PRINTING STOCK=======");
					for(int i=0;i<n;i++) {
						System.out.println(ItemStock[i].toString());
					}
					break;
				}
				case 2: {
					System.out.println("=======BUY ITEM=======");
					System.out.print("Enter Item Code To buy : ");
					int buycode = sc.nextInt();
					System.out.print("Enter Item Quantity To buy : ");
					int buyqty = sc.nextInt();
					int index=-1;
					for(int i=0;i<n;i++) {
						if(ItemStock[i].getItemCode()==buycode) {
							index = i;
						}
					}
					if(index != -1) {
						if(ItemStock[index].getQty()>=buyqty) {
						ItemList[x] = new Item(ItemStock[index], buyqty);
						ItemStock[index].setQty(ItemStock[index].getQty() - buyqty);
						bill += buyqty * ItemStock[index].getPrice();
						x++;
						}
						else {
							System.out.println("Stock Not Available");
						}
					}
					else {
						System.out.println("NO ITEAM WITH THIS ID");
					}
					break;
				}
				case 3: {
					System.out.println("Total Bill : "+bill);
					break;
				}
				default: System.out.println("INVALID INPUT");
			}
			
		}while(op!=0);
		
		
		sc.close();
	}

}
