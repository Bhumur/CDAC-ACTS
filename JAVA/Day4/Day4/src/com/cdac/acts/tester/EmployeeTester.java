package com.cdac.acts.tester;

import java.util.Scanner;

import com.cdac.acts.employee.Employee;



public class EmployeeTester {

	public static void printMenu() {
		System.out.println("OPTIONS :-");
		System.out.println("1. Add Employee.");
		System.out.println("2. Search Employee by RollNo.");
		System.out.println("3. Print All Employees Sorted by Salary.");
		System.out.println("0. EXIT.");
		System.out.print("\nEnter Option : ");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter The Size Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Employee []arr = new Employee[n];
		int i=0;
		
		int op;
		do {
				printMenu();
				op = sc.nextInt();
				switch(op) {
					case 1:	{
						if(i<n) {
						System.out.print("Enter Name of Employee : ");
						String name = sc.next();
						System.out.print("Enter Salary of Employee : ");
						double sal = sc.nextDouble();
						arr[i] = new Employee(name,sal);
						System.out.println("Employee Succesfully Added");
						System.out.println(arr[i].toString());
						i++;
						}
						else {
							System.out.println("CAN'T ADD Employee BECAUSE ARRAY IS FULL");
						}
						break;
					}
					case 2:	{
						System.out.print("Enter Employee ID of Employee want to find : ");
						int roll = sc.nextInt();
						String s="";
						for(int j=0;j<i;j++) {
							if(arr[j].getEmpId()==roll) {
								s = arr[j].toString();
								break;
							}
						}
						if(s.length()!=0) {
							System.out.println(s);
						}
						else {
							System.out.println("Employee Not Found");
						}
						break;
					}
					case 3: {
						for(int x=0;x<i;x++) {
							for(int y=x+1;y<i;y++) {
								if(arr[x].getSalary()>arr[y].getSalary()) {
									Employee s = arr[x];
									arr[x] = arr[y];
									arr[y] = s;
								}
							}
						}
						for(int x=0;x<i;x++) {
							System.out.println(arr[x].toString());
						}
						break;
					}
					case 0: break;
					default: System.out.println("INVALID OUTPUT");
			}
			
		}while(op!=0);
		sc.close();
		
	}

}
