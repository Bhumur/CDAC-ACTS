package com.cdac.acts.tester;

import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

import com.cdac.acts.fruits.Fruit;
import com.cdac.acts.util.DataEntry;

public class FruitTest {

	public static void main(String[] args) {
		List<Fruit> fruitList = DataEntry.listFruits();
		try(Scanner sc = new Scanner(System.in)){
		
			int op;
			do {
				System.out.println("OPTIONS:-");
				System.out.println("1. Add Fruit");
				System.out.println("2. Print Fruit Array");
				System.out.println("3. Sort fruits by color (natural order)");
				System.out.println("4. Sort by quantity");
				System.out.println("5. Sort by price");
				System.out.println("0. EXIT");
				System.out.print("\nEnter your Choice : ");
				
				op = sc.nextInt();
				
				switch(op) {
					case 1: {
						System.out.println("_________ADD FRUIT___________");
						System.out.print("Enter Name of Fruit : ");
						String name = sc.next();
						System.out.print("Enter Price of Fruit : ");
						Double price = sc.nextDouble();
						System.out.print("Enter Color of Fruit : ");
						String color = sc.next();
						System.out.print("Enter Quantity of Fruit : ");
						Integer qty = sc.nextInt();
						Fruit f = new Fruit(name, color, price, qty);
						fruitList.add(f);
						System.out.println("Fruit Successfully Added");
						break;
					}
					case 2: {
						System.out.println("____________Display ALL FRUITS__________");					
						for(Fruit a : fruitList) {
							System.out.println(a);
						}
						break;
					}
					case 3: {
						System.out.println("____________Sort fruits by color (natural order)__________");
						Collections.sort(fruitList);
						break;
					}
					case 4: {
						System.out.println("____________Sort by quantity__________");
						Collections.sort(fruitList, new Comparator<Fruit>() {
							@Override
							public int compare(Fruit a, Fruit b) {
								return a.getQty().compareTo(b.getQty());
							}
						});
						break;
					}
					case 5: {
						System.out.println("___________Sort by price__________");
						Collections.sort(fruitList, new Comparator<Fruit>() {
							@Override
							public int compare(Fruit a, Fruit b) {
								return a.getPrice().compareTo(b.getPrice());
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

}
