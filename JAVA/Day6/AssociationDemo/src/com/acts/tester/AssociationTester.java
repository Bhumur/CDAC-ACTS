package com.acts.tester;

import com.acts.Address;
import com.acts.Employee;
import com.acts.Student;

public class AssociationTester {

	public static void main(String[] args) {

		Address address = new Address("401", "lane2", "Pashan", "411000");
		System.out.println(address.toString());
		
		Employee employee = new Employee(1001, "Bhumur", 2500000, address);
		System.out.println(employee.toString());
		
	}

}
