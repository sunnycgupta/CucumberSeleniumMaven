package com.java.programs;

public class PrintCountOfOccuranceOfCharacterInString {

	public static void countOccuranceUsingArray(String str,char val) {
		int count=0;
		if(str==null|| str.isEmpty()||str.length()==1) {
			System.out.println("Not a valid candidate");
			return;
		}
		char words[]=str.toCharArray();
		for(char word:words) {
			if(word ==val) {
				count++;
			}
		}
		System.out.println(val +" : "+count);
	}
	
	public static void countCharactersUsingCharAtMethod(String str,char ch) {
		
		int count=0;
		if(str==null||str.isEmpty()||str.length()==1)
		{
			System.out.println("Not a valid candidate");
			return ;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch + " : "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countOccuranceUsingArray("a",'o');
		countCharactersUsingCharAtMethod("Sunny",'n');
	}

}
