package com.cdac.acts.shape.type;

import com.cdac.acts.shape.Shape;

public class Rectangle extends Shape{
	private double length;
	private double breath;
	public Rectangle() {
		super();
		this.length = 0.0;
		this.breath = 0.0;
	}
	public Rectangle(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	@Override
	public double calculateArea() {
		return length*breath;
	}
	@Override
	public double calculatePerimeter() {
		return 2*(length+breath);
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}
}
