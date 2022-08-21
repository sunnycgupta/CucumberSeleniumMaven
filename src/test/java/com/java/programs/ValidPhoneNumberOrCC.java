package com.java.programs;

public class ValidPhoneNumberOrCC {
	
	public static boolean isValidNumber(String str)
	{
		try {
		Long.parseLong(str);
		System.out.println("Valid phone number : "+str);
		}
		catch(NumberFormatException e) {
			System.out.println("Number is not valid phone number : "+str);
			return false;
		}
		return true;
		
	}
	
	public static boolean checkValidPhoneNumber(String str) {
		
		if(str.length()==10 && isValidNumber(str)) {
			System.out.println("Its valid number "+str);
			return true;
		}
		System.out.println("Invalid phone number");
		return false;
	}

	public static void main(String[] args) {
		
		
		checkValidPhoneNumber("1234567890");
		checkValidPhoneNumber("111234567890");
		checkValidPhoneNumber("12345678");
		
		

	}

}
