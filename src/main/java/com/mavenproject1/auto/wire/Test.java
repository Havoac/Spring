package com.mavenproject1.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject1/auto/wire/auto_config.xml");
	
		Emp emp1 = context.getBean("emp1", Emp.class);		// Automatically typecasts
		System.out.println(emp1);
		
		Emp emp2 = context.getBean("emp2", Emp.class);		// Automatically typecasts
		System.out.println(emp2);
	}
}
