package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price of pepsi");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	/* this is a init method */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Took pepsi (init)");
	}

	/* this is a destroy method */
	@Override
	public void destroy() throws Exception {
		System.out.println("Threw pepsi out (destroy)");
	}
	
	
}
