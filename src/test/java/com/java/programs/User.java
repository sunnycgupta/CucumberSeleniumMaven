package com.java.programs;

public class User {

	private String name;
	private int rollno;
	private int marks;
	private int age;
	
	public User(String name,int rollno,int marks,int age) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNo()
	{
		return rollno;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", age=" + age + "]";
	}
	
	
}
