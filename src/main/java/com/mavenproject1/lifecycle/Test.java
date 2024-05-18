package com.mavenproject1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// context ki wajah se jitne bhi classes ke beans he config me, un sabke setter, init methods call hojaate
		// Order of methods calling :- Setter, init, Do, destroy
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject1/lifecycle/lifecycle_config.xml");
		context.registerShutdownHook(); // use to destroy method (to destroy method)

		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);

		System.out.println("  ------------------------------  ");
		
		Pepsi p1 = (Pepsi)context.getBean("p1"); 
		System.out.println(p1);
	}
}
