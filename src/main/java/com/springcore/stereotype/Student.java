package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // If we want the bean object name(student) to be something else, then use
			// @Component("object name")
@Scope("prototype") // The copy of the objects will not be used, every time a new object will be created.
					// If prototype is not used, then by default the scope will be
					// singleton (the copy of the object that was initially created will be used)
public class Student {
	/* Value annotation is to give value to the fields */

	@Value("Shivansh")
	private String studentName;
	@Value("Noida")
	private String city;
	@Value("#{temp}")
	private List<String> addresses;

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

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
