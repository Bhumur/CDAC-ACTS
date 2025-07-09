package com.cdac.acts.tester;
import com.cdac.acts.maths.Calsi;
import java.util.Scanner;

public class CalculatorTest{
	public static void main(String[] args){
		System.out.println("ENTER NUMBER TO PERFORM OPERATION : ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int op;
		do{
			System.out.println("1. ADDITION");
			System.out.println("2. SUBSTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			System.out.println("0. EXIT");
			System.out.println("ENTER AN OPTION : ");
			op = sc.nextInt();
			
			switch(op)
			{
				case 1: System.out.println("Sum of "+n1+"and "+n2+" : "+ Calsi.add(n1,n2));
						break;
				case 2: System.out.println("Sub of "+n1+"and "+n2+" : "+ Calsi.sub(n1,n2));
						break;
				case 3: System.out.println("Mul of "+n1+"and "+n2+" : "+ Calsi.mul(n1,n2));
						break;
				case 4: System.out.println("Div of "+n1+"and "+n2+" : "+ Calsi.div(n1,n2));			
						break;
				default: System.out.println("Enter Correct option");
			}
		}while(op!=0);
	}
}