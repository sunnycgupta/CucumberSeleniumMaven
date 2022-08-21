package com.java.programs;

public class CheckBinaryNumber {

	public static void isBinary(int number)
	{
		boolean flag=true;
		int rev=number;
		while(number!=0) {
			int rem=number%10;
			if(rem>1) {
				flag=false;
				break;
			}
			else {
				number=number/10;
			}
		}
		if(flag) {
			System.out.println("The number is binary : "+rev);
		}
		else
		{
			System.out.println("The number is not binary : "+rev);
		}
	}
	
	public static void main(String[] args) {
	isBinary(101010);
	isBinary(202010);
	
	int number=1000100;
	
	if(String.valueOf(number).matches("[0-1]+"))
		System.out.println("Value is boolean value");;

	}

}
