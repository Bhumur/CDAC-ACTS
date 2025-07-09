package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.student.Student;
public class StudentTester {
	
	public static void printMenu() {
		System.out.println("OPTIONS :-");
		System.out.println("1. Add Students.");
		System.out.println("2. Search Student by RollNo.");
		System.out.println("3. Print All students Sorted by Marks.");
		System.out.println("0. EXIT.");
		System.out.print("\nEnter Option : ");
	}

	public static void main(String[] args) {
		System.out.println("Enter The Size Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student []arr = new Student[n];
		int i=0;
		
		int op;
		do {
				printMenu();
				op = sc.nextInt();
				switch(op) {
					case 1:	{
						if(i<n) {
						System.out.print("Enter RollNo : ");
						int roll = sc.nextInt();
						System.out.print("Enter Name : ");
						String name = sc.next();
						System.out.print("Enter Marks : ");
						double mark = sc.nextDouble();
						arr[i] = new Student(roll,name,mark);
						System.out.println("Student Succesfully Added");
						i++;
						}
						else {
							System.out.println("CAN'T ADD STUDENT BECAUSE ARRAY IS FULL");
						}
						break;
					}
					case 2:	{
						System.out.print("Enter RollNo of Student want to find : ");
						int roll = sc.nextInt();
						String s="";
						for(int j=0;j<i;j++) {
							if(arr[j].getRollno()==roll) {
								s = arr[j].toString();
								break;
							}
						}
						if(s.length()!=0) {
							System.out.println(s);
						}
						else {
							System.out.println("Student Not Found");
						}
						break;
					}
					case 3: {
						for(int x=0;x<i;x++) {
							for(int y=x+1;y<i;y++) {
								if(arr[x].getMarks()>arr[y].getMarks()) {
									Student s = arr[x];
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
