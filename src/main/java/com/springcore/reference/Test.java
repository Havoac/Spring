package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/ref_config.xml");

		A aObject = (A) context.getBean("aref");
		System.out.println(aObject.getX());

		System.out.println(aObject.getbObject().getY());
		System.out.println(aObject);
	}
}
