package com.cdac.acts.tester;

import com.cdac.acts.util.DataEntry;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.exception.StudentExistExeption;
import com.cdac.acts.school.Student;
import com.cdac.acts.school.StudentKey;

public class StudentTest {
	public static void main(String[] args) throws StudentExistExeption {
		Map<StudentKey,Student> students =  DataEntry.datastudentMap();
		try(Scanner sc = new Scanner(System.in)){
			int op;
			do {
				System.out.println("OPTIONS:-");
				System.out.println("1. Add Student.");
				System.out.println("2. Find Student.");
				System.out.println("3. Print All Students.");
				System.out.print("\nEnter Your choice : ");
				op = sc.nextInt();
				switch(op) {
					case 1: {
						StudentKey sk =null;
						try {
							System.out.print("Enter Standerd of Student : ");
							Integer std = sc.nextInt();
							System.out.print("Enter Division of Student : ");
							String div = sc.next();
							System.out.print("Enter RollNo of Student : ");
							Integer rollno = sc.nextInt();
							sk = new StudentKey(std,div,rollno);
							if(students.get(sk)!=null) {
								throw new StudentExistExeption("Duplicate Student");
							}
						}catch(StudentExistExeption e) {
							e.printStackTrace();
							break;
						}
						System.out.print("Enter Name Of Student : ");
						String name = sc.nextLine();
						students.put(sk, new Student(sk, name));
						break;
					}
					case 2: {
						System.out.print("Enter Standerd of Student : ");
						Integer std = sc.nextInt();
						System.out.print("Enter Division of Student : ");
						String div = sc.next();
						System.out.print("Enter RollNo of Student : ");
						Integer rollno = sc.nextInt();
						StudentKey sk = new StudentKey(std,div,rollno);
						if(students.get(sk)!=null) {
							System.out.println(students.get(sk));
						}
						else {
							System.out.println("Student Not found");
						}
						break;
					}
					case 3: {
						Set<Map.Entry<StudentKey,Student>> equal = students.entrySet();
						for(Map.Entry<StudentKey,Student> e : equal) {
							System.out.println("\nKey : " + e.getKey() + "\nValue : " + e.getValue()+ "\n");
						}
						break;
					}
					case 0: break;
					default: System.out.println("INVALID Input");
				}
			}while(op!=0);
		}
	}
}
