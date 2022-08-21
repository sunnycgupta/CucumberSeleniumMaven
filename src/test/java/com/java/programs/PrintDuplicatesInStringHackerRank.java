package com.java.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesInStringHackerRank {

	public static void printDuplicates(String str) {
		
		if(str==null) {
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		if(str.length()==1) {
			System.out.println("String has only one character");
			return;
		}
		char words[]=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch:words) {
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
		for(Map.Entry<Character, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + "  --  "+entry.getValue());
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDuplicates(null);
		printDuplicates("");
		printDuplicates("A");
		printDuplicates("Sunny Gupta ");
		printDuplicates("0011123");
		
	}

}
