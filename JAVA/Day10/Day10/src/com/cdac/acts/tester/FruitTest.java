package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.cdac.acts.fruits.Fruit;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("OPTIONS:-");
			System.out.println("1. Add Fruit");
			System.out.println("2. Print Fruit Array");
			System.out.println("3. Remove Fruit by index");
			System.out.println("4. Print by index");
			System.out.println("0. EXIT");
			System.out.print("\nEnter your Choice : ");
			
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					System.out.print("Enter Name of Fruit : ");
					String name = sc.next();
					System.out.print("Enter Price of Fruit : ");
					double price = sc.nextDouble();
					System.out.print("Enter Color of Fruit : ");
					String color = sc.next();
					System.out.print("Enter Quantity of Fruit : ");
					int qty = sc.nextInt();
					Fruit f = new Fruit(name, color, price, qty);
					fruitList.add(f);
					System.out.println("Fruit Successfully Added");
					break;
				}
				case 2: {
					System.out.println("____________Display ALL FRUITS__________");
//					for(int i=0;i<fruitList.size();i++) {
//						fruitList.get(i).toString();
//					}
					System.out.println(fruitList.toString());
					break;
				}
				case 3: {
					System.out.println("____________REMOVE BY INDEX__________");
					System.out.println("Enter Index of Fruit wants to remove : ");
					int x = sc.nextInt();
					if(x>=fruitList.size())
					{
						System.out.println("INDEX INVALID");
					}
					else {
						fruitList.remove(x);
						System.out.println("Fruit is Removed Successfully");
					}
					break;
				}
				case 4: {
					System.out.println("____________Print BY INDEX__________");
					System.out.println("Enter Index of Fruit wants to Print : ");
					int x = sc.nextInt();
					if(x>=fruitList.size())
					{
						System.out.println("INDEX INVALID");
					}
					else {
						System.out.println(fruitList.get(x));
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
