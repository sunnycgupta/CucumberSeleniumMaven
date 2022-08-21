package com.java.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberOfDigitsInNumber {
	
	public static void countDigits(long number) {
		
		if(String.valueOf(number).length()==1)
		{
			System.out.println(number +" : "+ 1);
		}
		
		Map<Long,Integer> map=new HashMap<Long,Integer>();
		
		while(number!=0)
		{
			long rem=number%10;
			if(map.containsKey(rem)) {
				map.put(rem, map.get(rem)+1);
			}
			else
			{
				map.put(rem,1);
			}
			number=number/10;
			
		}
		Set<Long> keys=map.keySet();
		
		for(Long key:keys)
		{
			System.out.println(key + " : "+map.get(key));
		}
	}

	public static void main(String[] args) {
		
		countDigits(100200);
		countDigits(0);
		countDigits(-124562);
		countDigits(989876765454L);

	}

}
