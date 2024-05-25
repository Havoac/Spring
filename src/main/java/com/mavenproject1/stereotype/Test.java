package com.mavenproject1.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject1/stereotype/stereo_config.xml");
		
		Student s1 = context.getBean("student", Student.class);		// student in context.getBean is the object name even though there is no such bean in the XML file. It takes the class name as bean object removing the upper camel case 
		
		System.out.println(s1);
		System.out.println(s1.getAddresses());
	
		Student s2 = context.getBean("student", Student.class);		// student in context.getBean is the object name even though there is no such bean in the XML file. It takes the class name as bean object removing the upper camel case 
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
	
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
