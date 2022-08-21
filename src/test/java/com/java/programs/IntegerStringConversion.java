package com.java.programs;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IntegerStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"s","r","c"};
		String str=String.join("", arr);
		System.out.println(str);
		
		String str1=Arrays.asList("s","u","g").stream().collect(Collectors.joining(""));
		System.out.println(str1);
		
		Integer[] arr1= {1,2,3,4,5};
		String str2=Arrays.asList(arr1).stream().map(e -> String.valueOf(e)).collect(Collectors.joining(""));
		System.out.println(str2);
		
		String str3=joinString(";", arr);
		System.out.println(str3);
	}
	
	public static String joinString(String seperator,String... values) {
		
		StringBuilder sb=new StringBuilder();
		int end=0;
		for(String s:values) {
			sb.append(s);
			end=sb.length();
			sb.append(seperator);
		}
		
		return sb.substring(0,end);
	}

}
