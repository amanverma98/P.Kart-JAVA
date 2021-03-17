package com.PKart.dao;
import java.util.List;

import com.PKart.model.Product;

public interface IProductDao {
	void addProduct(Product product);

	void removeProduct(Product product);

	void updateProduct(int id, Product product);

	Product viewProduct(int productId);
	
	List<Product> viewAllProducts();


}
