package com.java.programs;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;



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
	//program to print power
//	static int power(int x,int y)
//	{
//		if(y==0) {
//			return 1;
//		}
//		else if(y%2==0)
//		{
//			return power(x,y/2)*power(x,y/2);
//		}
//		else
//		{
//			return x* power(x,y/2)*power(x,y/2);
//		}
//	}
   public static void main(String[] args)
   {
	   //program to print power
//	   int x=3,y=4;
//	   System.out.println(power(3,4));
	   
	   
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
	   
	   
	  
	   
	   
	   
	   // reverse each word inside a string
//	   String str="This is a quick String";
//	   String reverseStr="";
//	   String words[]=str.split(" ");
//	   for(String word:words) {
//		   String reverseWord="";
//		   for(int i=word.length()-1;i>=0;i--) {
//			   reverseWord=reverseWord+word.charAt(i);
//			   }
//		   reverseStr=reverseStr+reverseWord+" ";
//	   }
//	   System.out.println(reverseStr.trim());
	   
	//programatically check if array is null , empty or has null values
	   
//	   int arr[]=null;
//		if(arr==null) {
//			System.out.println("Array is null");
//		}
//		 int arr1[]=new int[0];
//		 if(arr1.length==0) {
//			 System.out.println("Array is empty");
//		 }
//	
//		 Integer arr2[]= {1,4,2};
//		 boolean flag=true;
//		 for(int i=0;i<arr2.length;i++)
//		 {
//			 if(arr2[i]!=null)
//			 {
//				flag=false; 
//			 }
//		 }
//		 if(flag) {
//			 System.out.println("Values are null");
//		 }
//			ArrayUtils.isNotEmpty(arr)	; 
	   
	 
	   //program to print unique elements in array
//	   int arr[]= {1,1,2,2,2,3,3,3,4,4,4,4,5,5};
//	   int n=arr.length;
//	   int temp[]=new int[n];
//	   
//	   int j=0;
//	   for(int i=0;i<n-1;i++) {
//		   if(arr[i]!=arr[i+1]) {
//			   temp[j++]=arr[i];
//		   }
//		   	   
//	   }
//	   temp[j++]=arr[n-1];
//	   
//	   for(int k=0;k<j;k++) {
//		   System.out.println(temp[k]);
//		
//	   }
//	  
//   }
	   //insertion sort uses while loop 
//	   public static void insertionSort(int array[]) {  
//	        int n = array.length;  
//	        for (int j = 1; j < n; j++) {  
//	            int key = array[j];  
//	            int i = j-1;  
//	                array [i+1] = array [i];  
//	                i--;  
//	            }  
//	            array[i+1] = key;  
//	        }  
//	    }  
	   
	   
	   // sorting strings of array using selection sort
	   
//	   String arr[]= {"GeeksforGeeks","Practice.Geeks","GeksQuiz"};
//	   int n =arr.length;
//	   
//	   for(int i=0;i<n-1;i++) {
//		   
//		   int min_index=i;
//		   String min_string=arr[i];
//		   
//		   for(int j=i+1;j<n;j++) {
//			   if(arr[j].compareTo(min_string)<0) {
//				   min_index=j;
//				   min_string=arr[j];
//			   }
//		   }
//		   
//		   if(min_index!=i) {
//			   String temp=arr[min_index];
//			   arr[min_index]=arr[i];
//			   arr[i]=temp;
//			   
//		   }
//	   }
//	   
//	   for(String str:arr) {
//		   System.out.println(str);
//	   }
	   
	   // merge to arrays in to a single array
	   
//	   int arr1[]= {1,2,3,4};
//	   int arr2[]= {5,6,7,8};
//	   HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
//	   for(int i=0;i<arr1.length;i++) {
//		   hm.put(arr1[i], true);
//	   }
//	   
//	   for(int j=0;j<arr1.length;j++) {
//		   hm.put(arr2[j], true);
//	   }
//	   
//	   Set<Integer> str=hm.keySet();
//	   
//	   int n=str.size();
//	   int arr3[]=new int[n];
//	   int k=0;
//	   for(Integer it:str) {
//		   arr3[k++]=it;
//	   }
//	   
//	   for(int a:arr3) {
//		   System.out.println(a);
//	   }
//	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
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
	   
	  // print 1 to 100 without using for loop
//	   BitSet bs=new BitSet();
//	   bs.set(1, 101);
//	   System.out.println(bs);
	   
	   // print hello world without using ;
//	   if(System.out.printf("Hello world")==null) {
//		}
//	   
	   
	
	 //How-do-I-print-the-following-pattern-in-Java-
//	   55555
//	   54444
//	   54333
//	   54322
//	   54321
//	 for(int i=5;i>0;i--)
//	 {
//		 for(int j=5;j>i;j--) {
//			 System.out.print(j);
//		 }
//		 for(int k=i;k>0;k--)
//		 {
//			 System.out.print(i);
//		 }
//		 System.out.println();
//	 }
	   // simple * pattern
//	   int rows =5;
//	   
//	   for(int i=0;i<rows ;i++) {
//		   // for reverse * pattern use j<=rows-i 
//		   for(int j=0;j<=i;j++) {     
//			   System.out.print("*" +" ");
//		   }
//		   System.out.println();
//	   }
	   
	   //print pascal traiangele
//	   int n=6;
//	   
//	   {
//	        for (int i = 1; i <= n; i++) {  
//	            for (int j = 0; j <= n - i; j++) {
//	 
//	                // for left spacing
//	                System.out.print(" ");
//	            }
//	 
//	            // used to represent C(line, i)
//	            int C = 1;
//	            for (int k = 1; k <= i; k++) {
//	 
//	                // The first value in a line is always 1
//	                System.out.print(C + " ");
//	                C = C * (i - k) / k;
//	            }
//	            System.out.println();
//	        }
//	   }
	   
	   // left side print
//	   int rows=6;
//	   for(int i=0;i<rows;i++)
//	   {
//		   for(int j=2*(rows-i);j>1;j--)
//		   {
//			   System.out.print(" ");
//		   }
//	   for(int k=0;k<=i;k++) {
//		   System.out.print("*" +" ");
//	   }
//	   System.out.println();
//   }
	   
	   //pattern to print * triangle
//	   int rows=6;
//	   for(int i=0;i<rows;i++)
//	   {
//		   for(int j=(rows-i);j>1;j--)
//		   {
//			   System.out.print(" ");
//		   }
//	   for(int k=0;k<=i;k++) {
//		   System.out.print("*" +" ");
//	   }
//	   System.out.println();
//   }
	   
//	   int rows=8;
//	   for(int i=0;i<rows;i++) {
//		   
//		   for(int j=0;j<i;j++)
//		   {
//			   System.out.print(" ");
//		   }
//		   
//		   for(int k=0;k<rows-i;k++) {
//			   System.out.print("*" +" ");
//		   }
//		   System.out.println();
//	   }
//	   
//	   
	   
	   // check substring is present in string  like   sunny is present in sunny gupta
//	   String str="sunny gupta";
//	   String substr="sunny";
//	   boolean b1=str.matches("(.*)"+substr+"(.*)");
//	      
//	   boolean b2=str.contains(substr);
//	   
//	   boolean b3= str.indexOf(substr)!=1;
//	   
//	   System.out.println(b1);
//	   System.out.println(b2);
//	   System.out.println(b3);
	   
	   
	   // convert image from jpg to png ext 
//	   https://m.media-amazon.com/images/I/71H-Lk2b3mL._AC_SX679_.jpg
	   
	   try {
		URL url=new URL("https://m.media-amazon.com/images/I/71H-Lk2b3mL._AC_SX679_.jpg");
		
		BufferedImage image=ImageIO.read(url);
	
		ImageIO.write(image, "jpg", new File("./images/sunny.jpg"));
		ImageIO.write(image, "png",  new File("./images/sunny.png"));
		ImageIO.write(image, "jpg", new File("./images/sunny.bmp"));
		
		//ImageIO.write(image, "jpg", "./images/sunny.png");
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}

