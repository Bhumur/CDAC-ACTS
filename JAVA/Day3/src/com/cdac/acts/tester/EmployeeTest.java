package com.cdac.acts.tester;
import com.cdac.acts.employee.Employee;
import java.util.Scanner;
import java.lang.String;

public class EmployeeTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Employee []emp = new Employee[5];
		
		
		for(int i=0;i<5;i++){
			System.out.print("Enter Name of Employee : ");
			String name = sc.next();
			System.out.print("Enter Salary of Employee : ");
			double salary = sc.nextDouble();
			
			emp[i] = new Employee(name,salary);
		}
		
		
		for(int i=0;i<5;i++){
			
			emp[i].printEmp();
		}
			
	}
}
			
			
			
		