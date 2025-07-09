package com.cdac.acts.tester;

import com.cdac.acts.address.Address;
import com.cdac.acts.employee.Employee;

public class AssociationTest {

	public static void main(String[] args) {

		Address address = new Address("7/C2", "State Bank Nager", "Panchwati Pashan", "411008");
		System.out.println(address.toString());
		
		Employee employee = new Employee(1001, "Bhumur", 2500000, address);
		System.out.println(employee);
		
	}

}