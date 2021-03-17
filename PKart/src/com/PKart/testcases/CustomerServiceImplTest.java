package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Customer;
import com.PKart.model.Product;
import com.PKart.service.CustomerServiceImpl;

class CustomerServiceImplTest {
	private CustomerServiceImpl customerServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		customerServiceImpl = new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImpl = null;
	}

	@Test
	void testAddCustomer() {
		Customer customer = new Customer(101,"Mark","mark@gmail.com","90435678","45 Street, ND");
		boolean result = customerServiceImpl.addCustomer(customer);
		assertEquals(true,result);
		System.out.println("Test Case Pass");
	}

}
