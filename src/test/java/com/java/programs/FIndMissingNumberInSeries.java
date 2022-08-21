package com.java.programs;

public class FIndMissingNumberInSeries {

	public static int findMissingSeries(int arr[],int totalCount)
	{
		int expectedSum=totalCount * (totalCount+1)/2;
		int actualSum=0;
		for(int i:arr) {
			actualSum+=i;
		}
		return expectedSum-actualSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,5};
		int count=arr.length+1;
		int n1=findMissingSeries(arr,count);
		System.out.println(n1);
	}

}
