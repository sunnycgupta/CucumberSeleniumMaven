package com.java.programs;
import java.util.ArrayList;
import java.util.List;

public class TestUser {

	public static void main(String[] args) {

		User u1=new User("Sunny" ,1,80,34);
		User u2=new User("Shivali" ,2,95,33);
		User u3=new User("Dishant" ,3,75,37);
		User u4=new User("Vaibhav" ,4,85,36);
		User u5=new User("Rupali" ,5,90,32);
		
		List<User> userlist=new ArrayList<User>();
		
		userlist.add(u1);
		userlist.add(u2);
		userlist.add(u3);
		userlist.add(u4);
		userlist.add(u5);
		
		userlist.stream().forEach(e -> System.out.println(e));
		System.out.println("---------**-----------");
		
		userlist.stream().filter(e -> e.getMarks()>80).forEach(e -> System.out.println(e));
		
		int hm=userlist.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println("---------****-----------");
		userlist.stream().filter(e -> e.getMarks()==hm).forEach(e -> System.out.println(e));

	}

}
