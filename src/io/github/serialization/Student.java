package io.github.serialization;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author cocat
 * @created 12-08-2024 - 11:09 AM
 * @package-name io.github.serialization
 * @project Advance-Java
 */
public class Student implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L; // this is the serial version UID for the class

	private String name; // name of the student
	private int age; // age of the student
	private String address; // address of the student
	private transient String password; // password of the student, which will not be serialized
	
	public Student (
			String name,
			int age,
			String address
	) { // parameterized constructor
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/*
	* Getters and setters for the class starts
	* */
	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public int getAge () {
		return age;
	}

	public void setAge ( int age ) {
		this.age = age;
	}

	public String getAddress () {
		return address;
	}

	public void setAddress ( String address ) {
		this.address = address;
	}

	public String getPassword () {
		return this.password;
	}

	public void setPassword ( String password ) {
		this.password = password;
	}
	/*
	* Getters and setters for the class ends
	* */

	@Override // overriding the toString method
	public String toString () {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}

}
