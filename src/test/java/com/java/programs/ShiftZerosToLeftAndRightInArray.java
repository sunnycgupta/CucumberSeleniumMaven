package com.java.programs;
import java.util.Arrays;

public class ShiftZerosToLeftAndRightInArray {
	
	public static int[] shifRight(int arr[])
	{
		
		if(arr.length==1) {
			return arr;
		}
		else {
			int temp[]=new int[arr.length];
			int count=0;
			for(int a:arr) {
				if(a!=0) {
					temp[count++]=a;
				}
			}
			return temp;
		}
		
	}
	
	public static int[] shiftLeft(int arr[]) {
		
		if(arr.length==1) {
			return arr;
		}
		else
		{
			int count=0;
			int temp[]=new int[arr.length];
			for(int a:arr) {
				if(a==0) {
					temp[count++]=a;
				}
			}
			for(int a:arr) {
			
				if(a!=0) {
					temp[count++]=a;
				}
			}
			return temp;
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {1,1,0,3,0,0,4,5};
		System.out.println(Arrays.toString(shifRight(arr)));
		System.out.println(" --------------**----------------");
		System.out.println(Arrays.toString(shiftLeft(arr)));

	}

}
