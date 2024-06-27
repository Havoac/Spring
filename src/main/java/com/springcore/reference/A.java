package com.springcore.reference;

public class A {
	private int x;
	private B bObject;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getbObject() {
		return bObject;
	}

	public void setbObject(B bObject) {
		this.bObject = bObject;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", bObject=" + bObject + "]";
	}

}
