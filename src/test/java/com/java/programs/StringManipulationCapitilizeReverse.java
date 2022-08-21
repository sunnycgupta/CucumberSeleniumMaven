package com.java.programs;

public class StringManipulationCapitilizeReverse {

	public static String capitializeString(String str) {
		if(str==null) {
			System.out.println("String is null");
			return str;
		}
		
		if(str.length()==1) {
			return str;
		}
		
		String words[]=str.split("\\s");
		String capitalize="";
		for(String word:words) {
			
			String fname=word.substring(0,1).toUpperCase();
			String lname=word.substring(1);
			capitalize=capitalize+fname+lname+" ";
		}
		return capitalize.trim();
		
	}
	public static void main(String[] args) {
		
		System.out.println(capitializeString("sunny gupta java"));
		System.out.println(capitializeString("s"));
		System.out.println(capitializeString("sunny"));
		System.out.println(capitializeString("s s s s"));
		System.out.println(capitializeString("sunny gupta 123"));

	}

}
