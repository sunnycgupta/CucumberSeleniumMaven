package com.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayProgram {

	
//	public static int printHello() {
//		System.out.println("Hello world");
//		return 1;
//	}
//	
//	static int p=printHello();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int rows=scan.nextInt();
		System.out.println("Enter no of columns :");
		int columns=scan.nextInt();
		
		System.out.println("Enter the array values");
		int arr[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("print using for loop");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print( +arr[i][j] +" ");
								
			}
			System.out.println();
		}
		
		System.out.println("print using for each loop");
		
		for(int []r:arr)
			for(int i:r) {
				System.out.print(i+" ");
			}
		System.out.println();
		
		System.out.println("print using stream function");
		Arrays.stream(arr).forEach((e) -> {
			Arrays.stream(e).forEach((i) -> System.out.print(i + " "));
			System.out.println();
		});
	}

}
