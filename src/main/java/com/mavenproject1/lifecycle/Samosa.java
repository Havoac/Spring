package com.mavenproject1.lifecycle;

// firstly the setter function gets called because the object is created first and then the init method gets called and then the toString method
// to use destroy we need to use pre shutdown hook

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price of samosa");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init (samosa)");
	}
	
	public void destroy() {
		System.out.println("Inside destroy (samosa)");
	}
}
