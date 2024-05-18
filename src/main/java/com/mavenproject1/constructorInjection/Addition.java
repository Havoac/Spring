package com.mavenproject1.constructorInjection;

public class Addition {
	private int a;
	private int b;
	
	//Since the value is string by default ,the first constructor will get called.
	// But if the first constructor ain't here then the second will be called because of the order (which comes first)
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double, double");
	}
	
	public void DoSum() {
		System.out.println("Sum is : " + (this.a+this.b));
	}
}
