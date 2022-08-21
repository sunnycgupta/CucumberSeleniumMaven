package com.java.programs;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.google.common.base.CharMatcher;
import com.google.common.collect.ObjectArrays;
import com.google.common.math.Stats;
import com.google.common.primitives.Ints;

public class PatternPrint {

	
	public static void main(String[] args) throws MalformedURLException {
		
		
		// different types o dpattern
		
//		*                            *****              *    
//		**                           ****              **
//		***                          ***              ***
//		****                         **              ****
//		*****                        *              *****
//	
//		int alpha=65; //for Capital A use 65 else for small a use 97
//		int rows=6;
//		
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print((char)(alpha + j)+" ");
//			}
//			System.out.println();
//		}
		
//		String str1="sunny";
//		String str2="sunny";
//		String str3=new String("gupta");
//		String str4=new String("gupta");
//		if(str1==str2) {
//			System.out.println("I am able to match refersnce");
//			//this will match as both are pointing to string constant pool
//		}
//		
//		if(str3==str4) {
//			System.out.println("I am able to map objects");
//			//  this will not matcha as both are pesent at different location in heap memory 
//		}
		
		//System.out.println("/'Sunny'/");
		// hi there i am  a comment '\u000d  System.out.println("I am executed from a comment");
		//System.out.println(new URL("https://www.hubspot.com").equals(new URL("https://199.60.103.30")));
		
		//printing length 
//		String str="Sunny";
//		System.out.println(str.toCharArray().length);
//		System.out.println(str.lastIndexOf(""));
//		
//		Matcher m=Pattern.compile("$").matcher(str);
//		m.find();
//		System.out.println(m.end());
//		
//		System.out.println(str.split("").length);
//		
//		int count=0;
//		for(int i:str.toCharArray()) {
//			count++;
//		}
//		System.out.println(count);
		
//		List<String> str=Arrays.asList("Sunny","Gupta");
//		Set<String> set=str.stream().filter(e -> e.contains("Sunny")).collect(Collectors.toSet());
//		for(String s:set) {
//			System.out.println(s);
//		}
		// using String joiner class
//		StringJoiner join =new StringJoiner(":");
//		join.add("Sunny").add("Gupta");
//		
//		join.add("Shivali").add("Mishra");
//		System.out.println(join.toString());
		
		// Printing count of duplicate using stream class
		
//		String str="Java program";
//		long count=str.chars().filter(e -> (char)e=='a').count();
//		System.out.println(count);
		
		// count the number of vowels using java 8
		
//	IntPredicate vowel=new IntPredicate() {
//
//		@Override
//		public boolean test(int t) {
//			return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='I'||t=='E'||t=='O'||t=='U';
//		}
//		
//	};
//	String str="java examples";
//	long val=str.chars().filter(vowel).count();
//	System.out.println(val);	
//		
//	}
		// concat two arrays
//		String str1[]= {"A1","A2","A3","A4"};
//		String str2[]= {"B1","B2","B3","B4"};
//		
//		Stream<String> s1=Arrays.stream(str1);
//		Stream<String> s2=Arrays.stream(str2);
//		
//		String str3[]=Stream.concat(s1, s2).toArray(size -> new String[size]);
//		
//		for(String s:str3) {
//			System.out.println(s);
//		}
//		
//		System.out.println("Using guava google");
//
//		String str4[]=ObjectArrays.concat(str1, str2,String.class);
//		for(String s:str4) {
//			System.out.println(s);
//		}
//	
//		int a1[]={1,2,3};
//		int a2[]={35,36,74};
//		int a3[]=Ints.concat(a1,a2);
//		
//		CharMatcher.anyOf("aeiou").matchesAllOf("sunny gupta");
//		
		//  average of an array
		
//		int arr[]= {1,2,3,4,6,5,7,9,8,3};
//		int len=arr.length;
//		int total=0;
//		for(int i:arr)
//		{
//			total =total+i;
//		}
//		
//		System.out.println("Average is " + (total/len));
//		
//		// using java 8
//		OptionalDouble dbs=Arrays.stream(arr).average();
//		System.out.println(dbs.getAsDouble());
//		
//		
//		//using google guava
//		
//		double db=Stats.meanOf(arr);
//		System.out.println(db);
//		
//		double s = Stats.meanOf(num);
//		System.out.println(s);
		
		
		// Find the capital from the String
//		String str="SunnyGuptaShivaliMishra";
//		
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) >='A' && str.charAt(i)<='Z') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		int count1=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) >=65 && str.charAt(i)<=90) {
//				count1++;
//			}
//					
//		}
//		System.out.println(count1++);
//		
//		int count2=0;
//		for(int i=0;i<str.length();i++)
//		{
//			if(Character.isUpperCase(str.charAt(i)))
//			{
//				count2++;
//			}
//		}
//		System.out.println(count2);
//		
//		long c=str.chars().filter(e -> e>='A'&& e<='Z').count();
//		System.out.println(c);
//		
//		 long c1=str.chars().filter(e -> Character.isUpperCase(e)).count();
//		 System.out.println(c1);
		
		//  print s pattern
		
		int height=5;
		int i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height / 2
	                || i == height - 1))
	                System.out.printf("*");
	            else if (i < height / 2
	                    && j == 0)
	                System.out.printf("*");
	            else if (i > height / 2
	                    && j == height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
}


		

