package com.cc.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class UserData {

	private int ID;
	private String name;
	private int age;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	@Override
	public String toString() {
		return "UserData [ID=" + ID + ", name=" + name + ", age=" + age + "]";
	}
	
}
