package com.PKart.testcases;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.dao.ProductDaoImpl;
import com.PKart.model.Product;

class ProductDaoImplTest {
	private ProductDaoImpl productDao;

	@BeforeEach
	void setUp() throws Exception {
		productDao = new ProductDaoImpl(); 
	}

	@AfterEach
	void tearDown() throws Exception {
		productDao = null;
	}
	@Test
	void testViewProduct() {
		Product p1 = new Product(1,"Cake",200,2,"12-03-2021","16-03-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(1);
		assertEquals(p1.getId(), p2.getId());
		System.out.println("Test Case Pass");
	}
	@Test
	void testViewProductInValid() {
		Product p1 = new Product(1,"Cake",200,2,"12-03-2021","16-03-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(2);
		assertNotEquals(".",p1,p2);
		System.out.println("Test Case Fail");
	}

}
