package com.PKart.controller;
import java.util.List;
import java.util.Scanner;

import com.PKart.model.Customer;
import com.PKart.model.Product;
import com.PKart.service.CartServiceImpl;
import com.PKart.service.CustomerServiceImpl;
import com.PKart.service.ICartService;
import com.PKart.service.ICustomerService;
public class CustomerController {
	private static ICustomerService customerService = new CustomerServiceImpl();			//Object for Customer Services
	private static ICartService cartService = new CartServiceImpl();						//Object for Cart Services
	public void operations() {
		boolean status = true;
		while(status) {
			System.out.println("------Welcome to Home Screen------");
			System.out.println(" 1. Register New Customer \n 2. View Customer Profile \n 3. View Orders \n 4. Purchase Products \n 5. View Cart \n 6. Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter ID, Name, E-Mail ID, Phone Number, Address");
					int id = scanner.nextInt();
					String name = scanner.next();
					String email = scanner.next();
					String phoneNo = scanner.next();
					String address = scanner.next();
					Customer customer  = new Customer();
					customer.setId(id);
					customer.setName(name);
					customer.setEmail(email);
					customer.setPhoneNo(phoneNo);
					customer.setAddress(address);
					if (customerService.addCustomer(customer)) {
						System.out.println("Welcome to PKart "+ customer.getName());
					} else {
						System.out.println(" Try Again ");
					}
					
					break;
				case 2:
					System.out.println("Enter  Customer ID :");
					int id1  = scanner.nextInt();
					Customer customer1 = customerService.viewCustomer(id1);
					System.out.println(customer1);
					break;
				case 3:
					List<Product> allProducts1 = cartService.viewCart();
					for (Product Product : allProducts1)
				      { 		      
				           System.out.println(Product); 		
				      }
					break;
				case 4:
					List<Product> allProducts = customerService.purchaseProduct();
					
					for (Product Product : allProducts)
				      { 		      
				           System.out.println(Product); 		
				      }
					System.out.println("Enter Product ID for Purchasing :");
					int id2 = scanner.nextInt();
					Product p1 = new Product();
					p1.setId(id2);
					List<Product> allProducts3 = customerService.purchaseProduct();
					for (Product Product : allProducts3)
				      { 	
						if(id2 ==  Product.getId() )
						{
							p1 = Product;
							System.out.println("Product Added to Cart Successfully");
						}
							
				      }
					 cartService.addToCart(p1);
					break;
				case 5:
					List<Product> allProducts11 = cartService.viewCart();
					for (Product Product : allProducts11)
				      { 		      
				           System.out.println(Product); 		
				      }
					break;
				case 6:
					System.out.println("Logout..");
					status = false;
					MainController mainController = new MainController();
					mainController.runApplication();
				}
			}
	}
}
