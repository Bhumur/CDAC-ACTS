package com.cdac.acts.item;

public class Item {
	public static int parainc = 100;
	private int itemCode;
	private String itemName;
	private double price;
	private int qty;
	
	public Item(String itemName, double price, int qty) {
		this.itemCode = parainc++;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	
	public Item(Item a, int buyqty) {
		this.itemCode = a.itemCode;
		this.itemName = a.itemName;
		this.price = a.price;
		this.qty = buyqty;
	}
	
	
	public static int getParainc() {
		return parainc;
	}
	public static void setParainc(int parainc) {
		Item.parainc = parainc;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
