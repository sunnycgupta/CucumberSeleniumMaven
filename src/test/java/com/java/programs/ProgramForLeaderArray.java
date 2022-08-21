package com.java.programs;

public class ProgramForLeaderArray {

	
	public static void main(String[] args) {
	int arr[]= {12,32,55,11,33};
	int length=arr.length;
	int max=arr[length-1];
	for(int i=length-2;i>=0;i--) {
		if(arr[i]>max) {
			System.out.println("New max number is "+arr[i]);
			max=arr[i];
		}
	}

	}

}
