package com.PKart.model;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	public Customer() {
	}
	public Customer(int id, String name, String email, String phoneNo, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [ID = " + id + ", Name = " + name + ", E-Mail ID = " + email + ", Phone Number = " + phoneNo + ", Address = " 				+ address + "]";
	}
	public int testId(int id) {
		this.id = id;
		return this.id;
	}
	public String testName(String name) {
		this.name = name;
		return this.name;
	}
}

