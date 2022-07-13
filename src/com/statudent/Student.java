package com.statudent;
// Model or Bean 
public class Student {

	public String name;
	public int age;
	public String color;
	public String sex;
	public String country;
	public String address;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	public String running(String input) {
		String running=input;
		return running;
		
	}
	
	public String eating(String input) {
		String eating=input;
		return eating;
		
	}
	
	public String drinking(String input) {
		String drinking=input;
		return drinking;
		
	}
	
	

}
