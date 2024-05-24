package com.mavenproject1.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 			// if we want the bean object name(student) to be something else, then use @Component("object name")
public class Student {
	/* Value annotation is to give value to the fields */ 
	
	@Value("Shivansh")
	private String studentName;
	@Value("Noida")
	private String city;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}
