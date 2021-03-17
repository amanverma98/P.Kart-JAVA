package com.PKart.model;
import java.util.Map;

public class Cart {
	private long id;
	private static Map<Integer, Product> products;
	public Cart() {
	}
	public Cart(long id,  Map<Integer, Product> products) {
		this.id = id;
		Cart.products = products;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map<Integer, Product> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, Product> products) {
		Cart.products = products;
	}
	@Override
	public String toString() {
		return "Cart [ID = " + id + ", Products = " + products + "]";
	}
}