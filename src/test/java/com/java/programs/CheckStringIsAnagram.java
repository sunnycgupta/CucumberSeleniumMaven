package com.java.programs;
import java.util.Arrays;

public class CheckStringIsAnagram {
	
	public static boolean isAnagram(String s1,String s2)
	{
		String s3=s1.replaceAll("\\s", "");
		String s4=s2.replaceAll("\\s","");
		if(s3.length()!=s4.length()) {
			return false;
		}
		char c1[]=s3.toLowerCase().toCharArray();
		char c2[]=s4.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Strings are anagram");
		}
		return true;
	}

	public static void main(String[] args) {
		isAnagram("silent", "listen");
		isAnagram("CAT", "ACT");
		

	}

}
