package com.java.programs;

public class JavaProgramsStringManupiations {

	public static void main(String[] args) {
		
//		String str=" This is a string with spaces ";
//		//System.out.println(str.trim());
//		
//		//System.out.println(str.replaceAll("\\s+", ""));
//		String removeSpace="";
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)!=' ' && str.charAt(i)!='\t')
//			{
//				removeSpace=removeSpace+str.charAt(i);
//			}
//		}
//		System.out.println(removeSpace);
// program to print name 1000 times
//		String name="Sunny";
//		String s="i";
//		s=s.replaceAll("i", "iiiiiiiiii");
//		s=s.replaceAll("i", "iiiiiiiiii");
//		s=s.replaceAll("i", "iiiiiiiiii");
//		s=s.replaceAll("i", name +"\n");
//		System.out.println(s);
	
//		// program for max of three numbers
//		int a=20,b=10,c=5;
////		int max=0;
////		while(a>0||b>0||c>0) {
////			max++;
////			a--;
////			b--;
////			c--;
////		}
////		System.out.println(max);
//		
//		int min=0;
//		while(a>0 && b>0 && c>0) {
//		
//			a--;
//			b--;
//			c--;
//			min++;
//		}
//		System.out.println(min);
		//  program to capitalise first word of string
//		String str= "sunny gupta java";
//		String words[]=str.split("\\s");
//		String upperCaseResult="";
//		for(String word:words) {
//			upperCaseResult=upperCaseResult+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
//		}
//		System.out.println(upperCaseResult.trim());
		
		// program to count percentage of upper lower digits and speacial in string
		
		String str="SunnYGup$ a$m 123";
		int len=str.length();
		
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				special++;
			}
			 
		}
		double upperPercentage=(upper*100/len);
		double lowerPercentage=(lower*100/len);
		double digitPercentage=(digit*100/len);
		double specialPercentage=(special*100/len);
		
		System.out.println(upperPercentage+"  "+lowerPercentage+"  "+digitPercentage+"  "+specialPercentage);
		
		
	}

}
