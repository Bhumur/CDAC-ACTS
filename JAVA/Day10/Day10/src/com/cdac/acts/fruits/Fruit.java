package com.cdac.acts.fruits;

public class Fruit {
	private String name;
	private String color;
	private double price;
	private int qty;
	
	public Fruit() {
		super();
		this.name = "";
		this.color = "";
		this.price = 0.0;
		this.qty = 0;
	}
	public Fruit(String name, String color, double price, int qty) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
