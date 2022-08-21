package com.java.programs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aazvvbbcccfffdddd";
		char chars[]=str.toCharArray();
		int length=chars.length;
		// Using Hashset Approach
		Set<Character> set=new HashSet<Character>();
		for(char c:chars)
		{
			set.add(c);
		}
		
		for(Character ct:set)
		{
			System.out.println(ct);
		}
 		
		
		// using looping approach
		
		int index=0;
		
		for(int i=0;i<length;i++) {
			int j;
			for(j=0;j<i;j++)
			{
				if(chars[i]==chars[j])
				{
					break;
			}
			}
			if(i==j)
			{
				chars[index++]=chars[i];
			}
		}
		String uniqueStr=String.valueOf(Arrays.copyOf(chars,index));
		System.out.println(uniqueStr);
		
		
		
		
		
		
		
		
	}

}
