package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cdac.acts.Enums.CourseEnum;
import com.cdac.acts.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student []student = new Student[10];
		int index=0;
		int op;
		do {
			System.out.println("OPTIONS :-");
			System.out.println("1. Add Students");
			System.out.println("2. Sort Student by DOB And Display");
			System.out.println("0. EXIT");
			System.out.print("\nEnter your Choice : ");
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					if(index<10) {
						System.out.print("Enter Name of Student : ");
						String name = sc.next();
						System.out.print("Enter DOB of Student in dd/mm/yyyy Formate : ");
						String strDOB = sc.next();
						System.out.print("Enter Course of Student : ");
						String strCourse = sc.next();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate dob = LocalDate.parse(strDOB, formatter);
						CourseEnum course = CourseEnum.valueOf(strCourse.toUpperCase());
						student[index] = new Student(name, dob, course);
						System.out.println("\nStudent Added Sucessfully");
						System.out.println(student[index]);
						index++;
					}
					else {
						System.out.println("Student Array is Full");
					}
					break;
				}
				case 2: {
					for(int i=0;i<index;i++) {
						for(int j=i+1;j<index;j++) {
							LocalDate I = student[i].getDob();
							if(I.isAfter(student[j].getDob())) {
								Student s = student[i];
								student[i] = student[j];
								student[j] = s;
							}
						}
					}
					
					System.out.println("------Sorterd Students According to DOB--------");
					for(int i=0;i<index;i++) {
						System.out.println(student[i]);
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
