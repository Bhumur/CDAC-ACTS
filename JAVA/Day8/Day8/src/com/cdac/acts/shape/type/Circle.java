package com.cdac.acts.shape.type;

import com.cdac.acts.shape.Shape;

public class Circle extends Shape{
	private double radius;

	public Circle() {
		super();
		this.radius = 0.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("No need to draw real Circle just print message");
	}

	@Override
	public double calculateArea() {
		return 22/7*radius*radius;
	}
	@Override
	public double calculatePerimeter() {
		return 2*22*radius/7;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
