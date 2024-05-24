package com.mavenproject1.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenproject1.reference.A;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject1/standalone/collections/alone_config.xml");
		Person person1 = (Person)context.getBean("person1");
		System.out.println(person1);		
		System.out.println(person1.getFriends().getClass().getName());		//to get the class type
		System.out.println(person1.getProperties());
	}

}
