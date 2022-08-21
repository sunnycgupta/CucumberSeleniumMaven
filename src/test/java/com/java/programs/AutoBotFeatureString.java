package com.java.programs;
import java.lang.reflect.Field;

public class AutoBotFeatureString {

	static
	{
		try {
			Field value=String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Sunny", value.get("Hello there"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Sunny");
	}

}
