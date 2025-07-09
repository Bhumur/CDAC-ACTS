package com.cdac.acts.fruit;

public class Apple {
	private Double weight;
	private String color;
	private String taste;
	public Apple() {
		super();
		this.weight = null;
		this.color = "";
		this.taste = "";
	}
	public Apple(Double weight, String color, String taste) {
		super();
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}
	
}
