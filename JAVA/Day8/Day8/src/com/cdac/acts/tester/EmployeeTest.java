package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.cdac.acts.address.Address;
import com.cdac.acts.employee.Employee;
import com.cdac.acts.employee.type.ParmanentEmployee;
import com.cdac.acts.enums.DeptEnum;
import com.cdac.acts.enums.TypeEmp;
import com.cdac.acts.employee.type.ContractEmployee;
import com.cdac.acts.utils.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address address = new Address("7/C2","State Bank Nager", "Panchwati Pasan", "411008");
		Employee []emp = new Employee[20];
		int index=0;
		int op;
		
		do {
			option();
			op = sc.nextInt();
			switch(op) {
				case 1:{
					if(index<20) {
						addParmanent(sc, address, emp, index);
						index++;
					}
					else {
						System.out.println("EMPLOYEE ARRAY IS FULL");
					}
					break;
				}
				case 2: {
					if(index<20) {
						addContract(sc, address, emp, index);
						index++;
					}
					else {
						System.out.println("EMPLOYEE ARRAY IS FULL");
					}
					break;
				}
				case 3: {
					System.out.println("-----ALL EMPLOYEES-----");
					for(int i=0;i<index;i++) {
						System.out.println(emp[i].toString());
					}
					break;
				}
				case 4: {
					TypeEmp type = TypeEmp.valueOf("PE");
					System.out.println("-----ALL PARMANENT EMPLOYEES-----");
					for(int i=0;i<index;i++) {
						if(emp[i].getType()==type) {
							System.out.println(emp[i].toString());
						}
					}
					break;
				}
				case 5: {
					TypeEmp type = TypeEmp.valueOf("CE");
					System.out.println("-----ALL CONTRACT EMPLOYEES-----");
					for(int i=0;i<index;i++) {
						if(emp[i].getType()==type) {
							System.out.println(emp[i].toString());
						}
					}
					break;
				}
				case 6: {
					System.out.println("-----SORTED BY CALCULATE SALARY ALL EMPLOYEES-----");
					for(int i=0;i<index;i++) {
						for(int j=i+1;j<index;j++) {
							if(emp[i].CalSalary()>emp[j].CalSalary()) {
								Employee e = emp[i];
								emp[i] = emp[j];
								emp[j] = e;
							}
						}
					}
					
					for(int i=0;i<index;i++) {
						System.out.println(emp[i].toString());
					}
					break;
				}
				case 7: {
					System.out.println("-------Salary By EmpID------");
					System.out.println("Enter Employee Id : ");
					int empid = sc.nextInt();
					String s = "";
					for(int i=0;i<index;i++) {
						if(emp[i].getEmpId()==empid) {
							s = "Salary of " + emp[i].getName() + " is " + emp[i].CalSalary() + " Which is " + emp[i].getType().getValue();
						}
					}
					if(s.length()!=0) {
						System.out.println(s);
					}
					else {
						System.out.println("EMPLOYEE NOT EXIST");
					}
					break;
				}
				case 0: break;
				default: System.out.println("INVALID OPTIONS");
			}
		}while(op!=0);
		
		sc.close();
	}

	private static void addParmanent(Scanner sc, Address address, Employee[] emp, int index) {
		System.out.print("Enter Name of Employee : ");
		String name = sc.next();
		System.out.print("Enter Date of Joining of Employee in Formate dd/mm/yyyy : ");
		String strdoj = sc.next();
		System.out.print("Enter Department of Employee : ");
		String strdept = sc.next().toUpperCase();
		DeptEnum dept = DeptEnum.valueOf(strdept);
		TypeEmp type = TypeEmp.valueOf("PE");
		System.out.print("Enter Basic Salary of Parmanent Employee : ");
		double basic = sc.nextDouble();
		System.out.print("Enter Allowance of Parmanent Employee : ");
		double allowance = sc.nextDouble();
		System.out.print("Enter Bonus of Parmanent Employee : ");
		double bonus = sc.nextDouble();
		LocalDate doj = Date.stringToDate(strdoj);
		emp[index] = new ParmanentEmployee(name,doj,dept,address,type,basic,allowance,bonus);
		System.out.println("\n---Permanent Employee Added-----");
		System.out.println(emp[index].toString());
	}
	
	private static void addContract(Scanner sc, Address address, Employee[] emp, int index) {
		System.out.print("Enter Name of Employee : ");
		String name = sc.next();
		System.out.print("Enter Date of Joining of Employee in Formate dd/mm/yyyy : ");
		String strdoj = sc.next();
		System.out.print("Enter Department of Employee : ");
		String strdept = sc.next().toUpperCase();
		DeptEnum dept = DeptEnum.valueOf(strdept);
		TypeEmp type = TypeEmp.valueOf("CE");
		System.out.print("Enter Rate of Contract Employee : ");
		double rate = sc.nextDouble();
		System.out.print("Enter Number of Working Days of Contract Employee : ");
		int noofdays = sc.nextInt();
		LocalDate doj = Date.stringToDate(strdoj);
		emp[index] = new ContractEmployee(name,doj,dept,address,type,rate, noofdays);
		System.out.println("\n---Contract Employee Added-----");
		System.out.println(emp[index].toString());
	}

	private static void option() {
		System.out.println("CHOICE :-");
		System.out.println("1. Add Permanent Employee");
		System.out.println("2. Add Contract Employee");
		System.out.println("3. Display All Employee");
		System.out.println("4. Display All Parmanent Employee");
		System.out.println("5. Display All Contract Employee");
		System.out.println("6. SORTED Employee");
		System.out.println("7. SALARY OF EMPLOYEE BY EMP ID");
		System.out.println("0. EXIT");
		System.out.print("\nEnter Your Choice : ");
	}

}
