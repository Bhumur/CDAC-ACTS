package com.cdac.acts.tester;

import com.cdac.acts.interfaces.Drawable;
import com.cdac.acts.shape.type.Circle;
import com.cdac.acts.shape.type.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Drawable drawShape = new Circle(4.9);
		drawShape.draw();
		System.out.println("Perimeter of Circle is : " + drawShape.perimeter());
		System.out.println("Area of Circle is : " + drawShape.area());
		
		drawShape = new Rectangle(4.4,2.2);
		drawShape.draw();
		System.out.println("Perimeter of Circle is : " + drawShape.perimeter());
		System.out.println("Area of Circle is : " + drawShape.area());
	}

}
