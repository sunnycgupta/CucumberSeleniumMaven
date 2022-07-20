import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.xml.crypto.AlgorithmMethod;

import org.apache.poi.util.SystemOutLogger;



public class Java_Programs_Practice
{
	//fibonacci with recursion 
//	 static int n1=0,n2=1,n3=0;
//	 static void printFibonacci(int count)
//	 {
//		 if(count>0) {
//		n3=n1+n2;
//		 System.out.println(n3);
//		 n1=n2;
//		 n2=n3;
//		 printFibonacci(count-1);
//		 }
//	 }
   public static void main(String[] args)
   {
	   // count number of chatracters in string
//	   String str="Hello sunny gupta";
//	   int count=0;
//	   for(int i=0;i<str.length();i++) {
//		   if((str.charAt(i)!=' ')) {
//			   count++;
//		   }
//	   }
//	   System.out.println(count);
	   
	   // count the number of vowels and consonants in string
//	   String str="This is a simple string";
//	   str=str.toLowerCase();
//	   int vcount=0,constcount=0;
//	   for(int i=0;i<str.length();i++) {
//		   
//		   if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
//			   vcount++;
//		   }
//		   else if((str.charAt(i)>='a')&&(str.charAt(i)<='z')) {
//			   constcount++;
//		   }
//		   
//	   }
//	   
//	   System.out.println("vowels "+vcount+" ---- " +constcount);
	   
	   //GCD of two numbers
//	   int x=12,y=8,z=14,gcd=1;
//	   for(int i=1;i<=x&&i<=y&&i<=z;i++) {
//		   if(x%i==0 &&y%i==0 &&z%i==0) {
//			   gcd=i;
//		   }
//	   }
//	   System.out.println("GCD is "+ gcd);
	   
	   // reverse a string
//	   String str="nitin";
//	   String reverse="";
//	   for(int i=str.length()-1;i>=0;i--) {
//		   reverse=reverse + str.charAt(i);
//		   
//	   }
//	   System.out.println(reverse);
//	   if(str.equals(reverse)) {
//		   System.out.println("Strings are palindrome");
//	   }
//	   else {
//		   System.out.println("Strings are not palindrome");
//	   }
//	   
	   // count the duplicate characters in the string
	   
//	   String str="aabcddeefghhijj";
//	   HashMap<Character,Integer>  map=new HashMap<Character,Integer>();
//	   for(int i=0;i<str.length();i++)
//	   {
//		   char ch=str.charAt(i);
//		   if(map.containsKey(ch))
//		   {
//			   map.put(ch, map.get(ch)+1);
//		   }
//		   else {
//			   map.put(ch, 1);
//		   }
//	   }
//	   for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//		   if(entry.getValue()>1) {
//			   System.out.println("Duplicate key is ==> "+entry.getKey()+" duplicate value is "+entry.getValue());
//		   }
//	   }
	   
	   //linear search in an array
	   
//	   int arr[]= {1,2,3,4,5};
//	   int index=0;
//	   int key=3;
//	   for(int i=0;i<arr.length;i++) {
//		   if(arr[i]==key) {
//			   index=i;
//		   }
//	   }
//	   System.out.println("Index is "+ index);
	   
	   //binary search has concept of mid index
	   
//	   int arr[]= {10,20,30,40,50,60};
//	   int key=20,first=0,last=arr.length-1;
//	   int mid=(first+last)/2;
//	   while(first<=last) {
//		   if(arr[mid]<key) {
//			   first=mid+1;
//		   }
//		   else if(arr[mid]==key) {
//			   System.out.println("Key is found at index " + mid);
//			   break;
//		   }
//		   else {
//			   last=mid-1;
//		   }
//		   mid=(first+last)/2;
//		   
//	   }
//	   if(first>last) {
//		   System.out.println("key not present");
//	   }
	   
	   // Bubble sort in array
//	   int arr[]= {11,22,2,8,99,87,34};
//	   int temp;
//	   int n=arr.length;
//	   for(int i=0;i<n;i++) {
//		   for(int j=1;j<n-i;j++) {
//			   if(arr[j-1]>arr[j]) {
//				   temp=arr[j-1];
//				   arr[j-1]=arr[j];
//				   arr[j]=temp;
//			   }
//		   }
//	   }
//	   for(int i:arr) {
//		   System.out.println(i);
//	   }
	   
	   //selection sort  in array
//	   int arr[]= {22,33,44,11,5,6};
//	   int n=arr.length;
//	   
//	   for(int i=0;i<n-1;i++) {
//		   int index=i;
//		   for(int j=i+1;j<n;j++)
//		   {
//			   if(arr[j]<arr[index]) {
//				   index=j;
//			   }
//			
//		   }
//		   int smallerno=arr[index];
//		   arr[index]=arr[i];
//		   arr[i]=smallerno;
//	   }
	   
	   
	   //print pascal traiangele
	   //int n=6;
	   
//	   {
//	        for (int i = 1; line <= n; i++) {
//	            for (int j = 0; j <= n - i; j++) {
//	 
//	                // for left spacing
//	                System.out.print(" ");
//	            }
//	 
//	            // used to represent C(line, i)
//	            int C = 1;
//	            for (int k = 1; k <= k; k++) {
//	 
//	                // The first value in a line is always 1
//	                System.out.print(C + " ");
//	                C = C * (i - k) / k;
//	            }
//	            System.out.println();
//	        }
	   
	   
	   
	   // reverse each word inside a string
	   String str="This is a quick String";
	   String reverseStr="";
	   String words[]=str.split(" ");
	   for(String word:words) {
		   String reverseWord="";
		   for(int i=word.length()-1;i>=0;i--) {
			   reverseWord=reverseWord+word.charAt(i);
			   }
		   reverseStr=reverseStr+reverseWord+" ";
	   }
	   System.out.println(reverseStr.trim());
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
      //string manipulation with upper lower case
//	String str="this is sunny gupta";
//	String words[]=str.split("\\s");
//	String capital="";
//	for(String word:words) {
//		String firstWord=word.substring(0,1);
//		String remainingWords=word.substring(1);
//		capital=capital+ firstWord.toUpperCase()+remainingWords.toLowerCase()+" ";
//	}
//	System.out.println(capital.trim());
//	
	//facctttorail of number
//	int fact =1;
//	int number=5;
//	for(int i=1;i<=number;i++) {
//		fact=fact*i;
//	}
//	System.out.println(fact);  
	   
	   // printing fibonacii series
//	   int n1=0,n2=1,n3,count=10;
//	   System.out.println("The first two numbers are " + n1+ "-- "+n2);
//	   for(int i=2;i<count;i++) {
//		   n3=n1+n2;
//		   System.out.println(n3);
//		   n1=n2;
//		   n2=n3;
//		   
//	   }
	 //fibonacci with recursion 
//	   int count=10;
//	   System.out.println("first two values" + n1+ " "+n2);
//	   printFibonacci(count-2);
	   
	  // prime number in java
//	   int n=5;
//	   int m=n/2;
//	   int flag=0;
//	   for(int i=2;i<=m;i++)
//	   {
//		   if(n%i==0) {
//			   System.out.println("No is not prime");
//			   flag=1;
//		   }
//	   }
//	   if(flag==0) {
//		   System.out.println("number is prime");
//	   }
	   
	   // leap year program 
//	   int year =2020;
//	   if((year%4==0)&& (year%100!=0)||(year%400==0)) {
//		   System.out.println("leap year");
//	   }
//	   else
//	   {
//		   System.out.println("Not a leap year");
//	   }
	   
	   // finding minium value from array for min use condition arr[i]<min
//	   int arr[]= {5,8,9,2,7};
//	   int max =arr[0];
//	   for(int i=1;i<arr.length;i++) {
//		   if(arr[i]>max) {
//			   max=arr[i];
//		   }
//		  
//	   }
//	   System.out.println("Min value is " + max);
//	   
	   // palindrome number
//	   int num=454;
//	   int temp=num,rem,sum=0;
//	   while(num>0) {
//		   rem=num%10;
//		   sum=sum*10+rem;
//		   num=num/10;
//		   
//	   }
//	   if(sum==temp) {
//		   System.out.println("Number is palindrome");
//	   }
//	   else
//	   {
//		   System.out.println("Number is not palindrome");
//	   }
	   
	   //armstrong number 153  1+125+27
	   
//	   int num=153;
//	   int temp=num,sum=0,rem;
//	   while(num>0) {
//		   rem=num%10;
//		   sum=sum+rem*rem*rem;
//		   num=num/10;
//	   }
//	   
//	   if(temp==sum) {
//		   System.out.println("Armstrong number");
//	   }
//	   else {
//		   System.out.println("Number is not armstrong");
//	   }
	   //Addition of arrays
//	   int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int c[][]=new int[3][3];
//	   for(int i=0;i<3;i++) {
//		   for(int j=0;j<3;j++) {
//			   c[i][j]=a[i][j]+b[i][j];
//			   System.out.print(c[i][j] + " ");
//		   }
//		   System.out.println();
//	   }
	   
	   //multiplication of two numbers
	   
//	   int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int c[][]=new int[3][3];
//	   for(int i=0;i<3;i++) {
//		   for(int j=0;j<3;j++) {
//			   c[i][j]=0;
//			   for(int k=0;k<3;k++) {
//				   c[i][j]=c[i][j]+a[i][k]*b[k][j];
//				  
//			   }
//			   System.out.print(c[i][j] + " ");
//		   }
//			   System.out.println();
//		   }
//	   
	   //copy elements of array
//	   int arr1[]= {1,2,3,4,5};
//	   int arr2[]=new int[arr1.length];
//	   
//	   for(int i=0;i<arr1.length;i++) {
//		   arr2[i]=arr1[i];
//	   }
//	   for(int i=0;i<arr2.length;i++) {
//	   System.out.println(arr2[i]);
//	   }
	   
	   //duplicate element in an array
	   
//	   int arr[]= {1,2,33,33,2,6,6,7,9};
//	   for(int i=0;i<arr.length;i++) {
//		   for(int j=i+1;j<arr.length;j++)
//		   {
//			   if(arr[i]==arr[j]) {
//				   System.out.println(arr[i]);
//			   }
//		   }
//	   }
	   
	   // revers of an array 
//	   int arr[]= {1,2,3,4,5};
//	   for(int i=arr.length-1;i>=0;i--) {
//		   System.out.println(arr[i]);
//	   }
	   
	   //transpose of a matrix
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
