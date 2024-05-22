package com.mavenproject1.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired; 

public class Emp {
	// If it is placed above the setter function, setter injection takes place. If placed above the constructor, the constructor injection takes place.
	// Autowired is placed at either variable, or setter function or constructor
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}
}
