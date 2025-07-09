package com.cdac.acts.shape.type;

import com.cdac.acts.interfaces.Drawable;
import com.cdac.acts.shape.Shape;

public class Rectangle extends Shape implements Drawable {
	
	private double length;
	private double breadth;
	public Rectangle() {
		super();
		this.length = 0.0;
		this.breadth = 0.0;
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle");
	}

	@Override
	public double perimeter() {
		return 2*(length + breadth);
	}

	@Override
	public double area() {
		return length * breadth;
	}

}
