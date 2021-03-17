package com.PKart.controller;
import java.util.Scanner;

import com.PKart.util.InputUtil;
public class MainController {
	public static void main(String[] args) {
		runApplication();
	}
	static void runApplication() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("------WELCOME TO PKart-------");
		System.out.println("1. Customer \n2. Admin  \n3. Exit");
		System.out.println("Enter your Choice :");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			CustomerController customerController = new CustomerController();
			customerController.operations();		//Customer Panel
			break;

		case 2:
			AdminController adminController = new AdminController();
			adminController.operations();			//Admin Panel
			break;

		case 3:
			System.out.println("Logout..");
			System.exit(1);
		}
	}
}
