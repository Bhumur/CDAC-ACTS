package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cdac.acts.address.Address;
import com.cdac.acts.person.Person;

public class PersonTest {

	public static int datediff(LocalDate d1, LocalDate d2) {
		int ans;
		ans = 365*(d1.getYear()-d2.getYear()) + 30*(d1.getMonthValue()-d2.getMonthValue()) + (d1.getDayOfMonth()-d2.getDayOfMonth());
		return ans/365;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person []person = new Person[10];
		int index=0;
		int op;
		Address add = new Address("7/C2","State Bank Nager", "Panchwati Pasan", "411008");
		do {
			System.out.println("OPTIONS :-");
			System.out.println("1. Add Person");
			System.out.println("2. Person Born Before 15th August 1947");
			System.out.println("3. Age of Person");
			System.out.println("4. Person Age Greater than 100");
			System.out.println("0. EXIT");
			System.out.print("\nEnter your Choice : ");
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					if(index<10) {
						System.out.print("Enter Name of Person : ");
						String name = sc.next();
						System.out.print("Enter DOB of P in dd/mm/yyyy Formate : ");
						String strDOB = sc.next();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate dob = LocalDate.parse(strDOB, formatter);
						person[index] = new Person(name, dob, add);
						System.out.println("\nPerson Added Sucessfully");
						System.out.println(person[index]);
						index++;
					}
					else {
						System.out.println("Person Array is Full");
					}
					break;
				}
				case 2: {
					LocalDate ind = LocalDate.parse("1947-08-15");
					System.out.println("---Persons Born Before Independence-----");
					for(int i=0;i<index;i++) {
						if(ind.isAfter(person[i].getDob())) {
							System.out.println(person[i]);
						}
					}
					break;
				}
				case 3: {
					System.out.println("---Age of person-----");
					LocalDate cur = LocalDate.now();
					System.out.print("Enter Adhar No of Person to find Age : ");
					int adh = sc.nextInt();
					int x=-1,y=0;
					for(int i=0;i<index;i++) {
						if(adh == person[i].getadharNo()) {
							x = datediff(cur,person[i].getDob());
							y=i;
						}
					}
					if(x!=-1) {
						System.out.println("Age of " + person[y].getname() + " is " + x);
					}
					else {
						System.out.println("Invalid Adhar No.");
					}
					break;
				}
				case 4: {
					System.out.println("---Persons Age Greater Than 100-----");
					LocalDate cur = LocalDate.now();
					for(int i=0;i<index;i++) {
						if(datediff(cur,person[i].getDob())>=100) {
							System.out.println(person[i]);
						}
					}
					break;
				}
				case 0: break;
				default: System.out.println("\nINVALID INPUT\n");
			}
		}while(op!=0);
		sc.close();
	}
}
