package com.PKart.dao;
import java.util.ArrayList;

import com.PKart.model.Product;
public interface ICartDao {
	void addToCart(Product product);
	ArrayList<Product> viewCart();
}
