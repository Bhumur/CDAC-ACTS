package com.cdac.acts.shape.type;

import com.cdac.acts.interfaces.Drawable;
import com.cdac.acts.shape.Shape;

public class Circle extends Shape implements Drawable {

	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle");
	}

	@Override
	public double perimeter() {
		return 2*22*radius/7;
	}

	@Override
	public double area() {
		return 22*radius*radius/7;
	}

}
