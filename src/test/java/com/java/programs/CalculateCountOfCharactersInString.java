package com.java.programs;
import java.util.HashMap;
import java.util.Map;

public class CalculateCountOfCharactersInString {

	public static void countChars(String str) {
	
		char chars[]=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:chars) {
			
			if(c!=' ') {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c, 1);
				}
			}
		}
		//for checking only whitespaces use condition if(c==' ')
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countChars("test");
		System.out.println("  ---**----");
		countChars("t");
		System.out.println("  ---**----");
		countChars("  ");

	}

}
