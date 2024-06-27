package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.reference.A;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/alone_config.xml");
		
		Person person1 = (Person) context.getBean("person1");
		
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName()); // to get the class type
		System.out.println(person1.getProperties());
	}

}
