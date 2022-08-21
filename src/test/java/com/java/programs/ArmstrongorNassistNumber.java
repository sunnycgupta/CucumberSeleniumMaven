package com.java.programs;

public class ArmstrongorNassistNumber {

	public static boolean isArmstrongNumber(int number)
	{
		if(number<0)
		{
			return false;
		}
		
		if(number >=0 &&number<=9)
		{
			return true;
		}
		
		int power=power(number);
		int sum=0;
		
		int temp=number;
		while(number!=0)
		{
			int factor=1;
			int remainder=number%10;
			for(int i=0;i<power;i++) {
				factor=factor*remainder;
			}
			sum=sum+factor;
			number=number/10;
		}
		
		if(temp==sum) {
			return true;
		}
		return false;
	}
	
	public static int power(int number)
	{
		int n=0;
		while(number!=0)
		{
			n++;
			number=number/10;
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isArmstrongNumber(153));


	}

}
