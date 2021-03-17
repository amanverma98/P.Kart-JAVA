package com.PKart.testcases;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.dao.CustomerDaoImpl;
import com.PKart.model.Customer;

class CustomerDaoImplTest {
	private CustomerDaoImpl customerDao;
	@BeforeEach
	void setUp() throws Exception {
		customerDao = new CustomerDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerDao = null;
	}

	@Test
	void testViewCustomer() {
		Customer customer = new Customer(1,"Mark","mark@gmail.com","90435678","45 Street, ND" );
		customerDao.addCustomer(customer);
		Customer c = customerDao.viewCustomer(1);
		assertEquals(customer.getId(), c.getId());
		System.out.println("Test Case Pass");
		
	}@Test
	void testViewCustomerInValid() {
		Customer customer = new Customer(1,"Mark","mark@gmail.com","90435678","45 Street, ND" );
		customerDao.addCustomer(customer);
		Customer c = customerDao.viewCustomer(2);
		assertNotEquals(".",customer,c);
		System.out.println("Test Case Fail");
	}
}
