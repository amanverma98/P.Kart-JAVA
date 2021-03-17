package com.PKart.service;
import java.util.ArrayList;

import com.PKart.model.Cart;
import com.PKart.model.Product;
public interface ICartService {
	boolean addToCart(Product product);
	ArrayList<Product> viewCart();
}
