package com.PKart.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.PKart.model.Product;
public class CartDaoImpl implements ICartDao{
	private static Map<Integer, Product> carts;
	public CartDaoImpl() {
		if (null == carts) {
			carts = new HashMap<>();
		}
	}
	@Override
	public  void addToCart(Product product)
	{
		carts.put(product.getId(), product);
	}
	
	@Override
	 public ArrayList<Product> viewCart() {
		ArrayList<Product> list = new ArrayList<>();
		Collection<Product> productList = carts.values();
		for (Product p : productList) {
			list.add(p);
		}
		return list;
	}
}
