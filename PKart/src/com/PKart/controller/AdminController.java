package com.PKart.controller;
import java.util.List;
import java.util.Scanner;

import com.PKart.model.Customer;
import com.PKart.model.Product;
import com.PKart.service.CustomerServiceImpl;
import com.PKart.service.ICustomerService;
import com.PKart.service.IProductService;
import com.PKart.service.ProductServiceImpl;

public class AdminController {
	private static IProductService productService;				//Object for Product Services
	private static ICustomerService customerService;			//Object for Customer Services
	public AdminController() {
		if (null == productService) {
			productService = new ProductServiceImpl();
		}
		if (null == customerService) {
			customerService = new CustomerServiceImpl();
		}
	}
	public void operations() {
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations------");
			System.out.println(" 1. Add Product \n 2. Update Product \n 3. View Product \n 4. View All Products \n 5. View Customer \n 6. View Customer Order Details \n 7. Exit");
			System.out.println("Enter the Choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Product ID, Name, Price, Quantity, ManufacturedDate, ExpiryDate :");
				int id = scanner.nextInt();
				String name = scanner.next();
				double price = scanner.nextDouble();
				int quantity = scanner.nextInt();
				String mfdDate = scanner.next();
				String expDate = scanner.next();

				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setPrice(price);
				p.setQuantity(quantity);
				p.setMfdDate(mfdDate);
				p.setExpDate(expDate);

				if (productService.addProduct(p)) {
					System.out.println("Product Added Successfully.");
				} else {
					System.out.println("Product Not Added.");
				}
				break;

			case 2:
				Product pro = new Product();
				System.out.println("Enter Product ID which want to Update :");
				int id1 = scanner.nextInt();
				System.out.println("Enter Product Name, Price, Quantity, ManufacturedDate, ExpiryDate :");
				String name1 = scanner.next();
				double price1 = scanner.nextDouble();
				int quantity1 = scanner.nextInt();
				String mfdDate1 = scanner.next();
			    String expDate1 = scanner.next();
				pro.setId(id1);
				pro.setName(name1);
				pro.setPrice(price1);
				pro.setQuantity(quantity1);
				pro.setMfdDate(mfdDate1);
				pro.setExpDate(expDate1);
				productService.updateProduct(id1, pro);
				break;
			case 3:
				System.out.println("Enter Product ID to View :");
				id1 = scanner.nextInt();
				Product product1 = productService.viewProduct(id1);
				System.out.println(product1);
				break;
			case 4:
				List<Product> allProducts = productService.viewAllProducts();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;
			case 5:
				System.out.println("Enter Customer ID :");
				id1  = scanner.nextInt();
				Customer customer = customerService.viewCustomer(id1);
				System.out.println(customer);
				break;
			case 6:
				System.out.println("Enter Customer ID:");
				id1  = scanner.nextInt();
				Customer customer1 = customerService.orderDetails(id1);
				System.out.println(customer1);
				break;
			case 7:
				System.out.println("Exiting Admin operations..");
				status = false;
				MainController mainController = new MainController();
				mainController.runApplication();
			}
		}
	}
}
