package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // to denote that this class is handling all the configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	// If we want to manually give the name of the bean,
	// we write @Bean(name = {"s1", "s2"}). We can give as many name as we want.
	@Bean // to create bean object. function name is the bean name
	public Student getStudent() // return Student object
	{
		return new Student(new Samosa()); // creating a new object
	}
}
