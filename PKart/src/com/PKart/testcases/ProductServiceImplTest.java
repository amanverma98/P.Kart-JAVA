package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Product;
import com.PKart.service.ProductServiceImpl;

class ProductServiceImplTest {
	private ProductServiceImpl productServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		productServiceImpl = new ProductServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		productServiceImpl = null;
	}

	@Test
	void testAddProduct() {
		Product product = new Product(100,"Cake",200,2,"12-03-2021","16-03-2021");
		boolean result = productServiceImpl.addProduct(product);
		assertEquals(true,result);
		System.out.println("Test Case Pass");
	}
}
