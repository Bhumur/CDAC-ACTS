package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cdac.acts.Enums.DeptEnum;
import com.cdac.acts.employee.Employee;

public class EmployeeTest {
	public static int datediff(LocalDate d1, LocalDate d2) {
		int ans;
		ans = 365*(d1.getYear()-d2.getYear()) + 30*(d1.getMonthValue()-d2.getMonthValue()) + (d1.getDayOfMonth()-d2.getDayOfMonth());
		return ans/365;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee []emp =  new Employee[10];
		int index = 0;
		int op;
		do {
			System.out.println("OPTIONS :-");
			System.out.println("1. Add Employee");
			System.out.println("2. Return Age of All Employee");
			System.out.println("3. Employees Get Gratutiy");
			System.out.println("4. Sort the Employee on Age basis");
			System.out.println("5. Print all Employees");
			System.out.println("0. EXIT");
			System.out.print("\nEnter Yout Choice : ");
			op = sc.nextInt();
			
			switch(op) {
					case 1: {
						System.out.println("------------ADD EMPLOYEE--------------");
						if(index<10) {
							System.out.print("Enter Name of Employee : ");
							String name = sc.next();
							System.out.print("Enter Date of Birth in dd/mm/yyyy formate : ");
							String strdob = sc.next();
							System.out.print("Enter Date of Joining in dd/mm/yyyy formate : ");
							String strdoj = sc.next();
							System.out.print("Enter Department of Employee : ");
							String strdept = sc.next();
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							LocalDate dob = LocalDate.parse(strdob, formatter);
							LocalDate doj = LocalDate.parse(strdoj, formatter);
							DeptEnum dept = DeptEnum.valueOf(strdept);
							emp[index] = new Employee(name, dob, doj, dept);
							System.out.println("Emloyee Added Successfully");
							System.out.println(emp[index]);
							index++;
						}
						else {
							System.out.println("Employee Array is full");
						}
						break;
					}
				case 2: {
						System.out.println("------------AGE--------------");
						for(int i=0;i<index;i++) {
							System.out.println(emp[i].getEmpNo() + " " + emp[i].getName() + " " + "Age=" + datediff(LocalDate.now(),emp[i].getDob()));
						}
						break;
					}
				case 3: {
						System.out.println("------------EMPLOYEES GET GRATUTIY--------------");
						for(int i=0;i<index;i++) {
							if(datediff(LocalDate.now(),emp[i].getDoj())>=5) {
								System.out.println(emp[i]);
							}
						}
						break;
					}
				case 4: {
						System.out.println("------------SORT--------------");
						for(int i=0;i<index;i++) {
							for(int j=i+1;j<index;j++) {
								if(emp[i].getDob().isAfter(emp[j].getDob())) {
									Employee e = emp[i];
									emp[i] = emp[j];
									emp[j] = e;
								}
							}
						}
						break;
				}
				case 5: {
					System.out.println("------------ALL EMPLOYEES--------------");
					for(int i=0;i<index;i++) {
						System.out.println(emp[i]);
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
