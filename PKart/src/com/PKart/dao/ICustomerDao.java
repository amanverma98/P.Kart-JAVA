package com.PKart.dao;
import java.util.ArrayList;
import java.util.List;

import com.PKart.model.Customer;
import com.PKart.model.Product;

public interface ICustomerDao {
	boolean viewOrder(Customer customer);

	boolean purchasePoduct(Customer customer);

	void  orderDetails(int customerId);
	Customer viewCustomer(int id);


	public List<Customer> viewCart();

	void addCustomer(Customer customer);
	ArrayList<Product> purchaseProduct();
	
}
	
