package com.cdac.acts.Tester;
import java.util.Arrays;
import com.cdac.acts.employee.Employee;
import com.cdac.acts.student.Student;
public class ToStringTest {

	public static void main(String[] args) {
		//Print Int Array with Arrays.toString() 
		int []intarr = new int[] {1,6,8,9,5};
		System.out.println(Arrays.toString(intarr));
		
		String []stringarr = new String[] {"Bhumur", "Mukul", "Pratik"};
		System.out.println(Arrays.toString(stringarr));
		
		//Print Object With toString()
		Student s = new Student(9,"Bhumur", 99.98);
		System.out.println(s.toString());
		
		
		//Print Object With Arrays.toString()
		Student []stu = new Student[2];
		stu[0] = new Student(1,"Mukul",88.56);
		stu[1] = new Student(2,"Pratik",78.57);
		System.out.println(stu.toString());
		System.out.println(Arrays.toString(stu));
		
		
		Employee e = new Employee("Bhumur", 18326.23);
		System.out.println(e.toString());
		
		Employee []emp = new Employee[3];
		
		emp[0] = new Employee("Mukul",496546.25);
		emp[1] = new Employee("Pratik",4546.25);
		emp[2] = new Employee("Jotijai",96546.25);
		System.out.println(Arrays.toString(emp));
		

	}

}
