package com.PKart.model;


public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String mfdDate;
	private String expDate;
	public Product() {}
	public Product(int id, String name, double price, int quantity, String mfdDate, String expDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.mfdDate = mfdDate;
		this.expDate = expDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMfdDate() {
		return mfdDate;
	}
	public void setMfdDate(String mfdDate) {
		this.mfdDate = mfdDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		return "Product [ID = " + id + ", Name = " + name + ", Price = " + price + ", Quantity = " + quantity + ", Manufactured Date = "
				+ mfdDate + ", Expiry Date = " + expDate + "]";
	}
	public int testId(int id) {
		this.id = id;
		return this.id;
	}
	public String testName(String name) {
		this.name = name;
		return this.name;
	}
	public double testPrice(double price) {
		this.price = price;
		return this.price;
	}
	public int testQuantity(int quantity) {
		this.quantity = quantity;
		return this.quantity;
	}
}
