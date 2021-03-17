package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Customer;

class CustomerControllerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOperations() {
		Customer c1 = new Customer();
		int id = c1.testId(500);
		assertTrue(id>=101 && id<=999);
		System.out.println("Test Case Pass");
	}
	@Test
	void testOperationsNegativeIdValue() {
		
		Customer c1 = new Customer();
		int id = c1.testId(-1);
		assertTrue(id<0);
		System.out.println("Test Case Fail");

}
}
