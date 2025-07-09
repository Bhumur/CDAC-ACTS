package com.cdac.acts.tester;

import java.util.Scanner;

import com.cdac.acts.shape.Shape;
import com.cdac.acts.shape.type.Circle;
import com.cdac.acts.shape.type.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		do {
			options();
			op = sc.nextInt();
			
			switch(op) {
				case 1: {
					System.out.println("---------------Rectangle Object in Shape Refrence------------");
					System.out.print("Enter Length of Reactangle : ");
					double length = sc.nextDouble();
					System.out.print("Enter Breadth of Reactangle : ");
					double breath = sc.nextDouble();
					Shape shape = new Rectangle(length,breath);
					System.out.println("Perimeter of Rectangle is : " + shape.calculatePerimeter());
					System.out.println("Area of Rectangle is : " + shape.calculateArea());
					break;
				}
				case 2: {
					System.out.println("---------------Circle Object in Shape Refrence------------");
					System.out.print("Enter Radius of Circle : ");
					double radius = sc.nextDouble();
					Shape shape = new Circle(radius);
					System.out.println("Perimeter of Circle is : " + shape.calculatePerimeter());
					System.out.println("Area of Circle is : " + shape.calculateArea());
					break;
				}
				case 3: {
					System.out.println("---------------Circle Object in Shape Refrence then Circle Object DownCast------------");
					System.out.print("Enter Radius of Circle : ");
					double radius = sc.nextDouble();
					Shape shape = new Circle(radius);
					Circle c = (Circle)shape;
					c.draw();
					break;
				}
				case 0: break;
				default: System.out.println("INVALID INPUT");
			}
		}while(op!=0);
		sc.close();
	}

	private static void options() {
		System.out.println("OPTIONS:-");
		System.out.println("1. Rectangle Object in Shape Refrence");
		System.out.println("2. Circle Object in Shape Refrence");
		System.out.println("3. Circle Object in Shape Refrence then Circle Object DownCast");
		System.out.println("0. EXIT");
		System.out.print("\nEnter Your Choice : ");
	}

}
