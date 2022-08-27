package com.java.programs;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		
		countDuplicateWords("java is my java program is java my");
	}
	
	public static void countDuplicateWords(String str) {
		
		String words[]=str.split(" ");
		
		HashMap<String,Integer> wordmap=new HashMap<String,Integer>();
		
		for(String word:words) {
			
			if(wordmap.containsKey(word)) {
				wordmap.put(word, wordmap.get(word)+1);
			}
			else {
				wordmap.put(word, 1);
			}
		}
		
		Set<String> wordset=wordmap.keySet();
		
		for(String word:wordset) {
			if(wordmap.get(word)>1) {
				System.out.println(word +" : "+wordmap.get(word));
			}
		}
		
	}

}
