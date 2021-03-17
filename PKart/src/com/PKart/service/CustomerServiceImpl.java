package com.PKart.service;
import java.util.ArrayList;
import java.util.List;

import com.PKart.dao.CustomerDaoImpl;
import com.PKart.dao.ICustomerDao;
import com.PKart.model.Customer;
import com.PKart.model.Product;

public class CustomerServiceImpl implements ICustomerService{
	private static ICustomerDao customerDao;
	public CustomerServiceImpl() {
		if (null == customerDao)
			customerDao = new CustomerDaoImpl();
	}
	@Override
	public boolean viewOrder(Customer customer) {
		return false;
	}
	@Override
	public boolean purchasePoduct(Customer customer) {
		return false;
	}
	@Override
	public Customer orderDetails(int customerId) {
		return null;
	}
	@Override
	public List<Customer> getOrderDetails() {
		return null;
	}
	public Customer viewCustomer(int customerId) {
		return customerDao.viewCustomer(customerId);
	}
	@Override
	public boolean addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		Customer savedProduct = customerDao.viewCustomer(customer.getId());
		if (savedProduct != null)
			return true;
		else
			return false;
	}
	public ArrayList<Product> purchaseProduct() {
		return customerDao.purchaseProduct();
	}
	@Override
	public void addToCart(Product product) {
	}
}