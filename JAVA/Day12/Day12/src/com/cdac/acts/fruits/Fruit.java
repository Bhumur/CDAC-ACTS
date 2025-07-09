package com.cdac.acts.fruits;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private String color;
	private Double price;
	private Integer qty;
	
	public Fruit() {
		super();
		this.name = "";
		this.color = "";
		this.price = 0.0;
		this.qty = 0;
	}
	public Fruit(String name, String color, Double price, Integer qty) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", qty=" + qty + "]";
	}
	
	@Override
	public int compareTo(Fruit a) {
		return getColor().compareTo(a.getColor());
	}

}
