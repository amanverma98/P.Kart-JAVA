package com.PKart.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.PKart.model.Product;

public class ProductDaoImpl implements IProductDao{
	private static Map<Integer, Product> products;

	public ProductDaoImpl() {

		if (null == products) {
			products = new HashMap<>();
		}
	}

	@Override
	public void addProduct(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public void removeProduct(Product product) {
		products.remove(product.getId());
	}

	public void updateProduct(int id, Product product) {
		products.replace(id, product);	
	}

	@Override
	public Product viewProduct(int productId) {
		return products.get(new Integer(productId));
		
	}

	@Override
	public List<Product> viewAllProducts() {
		ArrayList<Product> list = new ArrayList<>();

		Collection<Product> productList = products.values();

		for (Product p : productList) {
			list.add(p);
		}

		return list;
	}
}
