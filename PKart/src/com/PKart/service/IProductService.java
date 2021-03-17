package com.PKart.service;
import java.util.List;

import com.PKart.model.Product;

public interface IProductService {
	boolean addProduct(Product product);

	boolean removeProduct(Product product);

	void updateProduct(int id1, Product product);

	Product viewProduct(int productId);

	List<Product> viewAllProducts();

}