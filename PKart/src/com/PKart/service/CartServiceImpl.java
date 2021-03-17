package com.PKart.service;
import java.util.ArrayList;

import com.PKart.dao.CartDaoImpl;
import com.PKart.dao.ICartDao;
import com.PKart.model.Product;

public class CartServiceImpl implements ICartService{
	private static ICartDao cartDao;
	public CartServiceImpl() {
		if (null == cartDao)
			cartDao =  new CartDaoImpl();
	}
	@Override
	public  boolean addToCart(Product product) {
		cartDao.addToCart(product);
		ArrayList<Product> savedProduct = cartDao.viewCart();
		if (savedProduct != null)
			return true;
		else
			return false;
	}
	@Override
	public ArrayList<Product> viewCart() {
		return cartDao.viewCart();	
	}
}
