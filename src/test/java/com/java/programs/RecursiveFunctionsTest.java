package com.java.programs;

public class RecursiveFunctionsTest {

	// Reverse a Number using recursion, where number can be +ve, 0 and -ve.
		public static void rev(long number) {

			if (number < 10 && number >= 0) {
				System.out.println(number);
				return;
			} else if (number < 0) {
				if (number >= -1 && number > -10) {
					System.out.println(number);
					return;
				}
				number = number * -1;
				System.out.print("-" + (number % 10));
				rev(number / 10);
			}

			else {
				System.out.print(number % 10);
				rev(number / 10);
			}

		}
}
