package com.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdditionSubtraction {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter no of rows: ");
//		int rows=scanner.nextInt();
//		System.out.println("Enter the number of columns: ");
//		int columns=scanner.nextInt();
//		int matrix1[][]=new int[rows][columns];
//		int matrix2[][]=new int[rows][columns];
//		int addition[][]=new int[rows][columns];
//		int subtraction[][]=new int[rows][columns];
//		System.out.println("Enter the values of matrix");
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<columns;j++)
//			{
//				matrix1[i][j]=scanner.nextInt();
//			}
//	}
//	
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<columns;j++)
//			{
//				matrix2[i][j]=scanner.nextInt();
//			}
//	}
//	
//	
//	
//	
//	for(int i=0;i<rows;i++)
//	{
//		for(int j=0;j<columns;j++)
//		{
//			addition[i][j]=matrix1[i][j]+matrix2[i][j];
//		}
//}
//
//	for(int i=0;i<rows;i++)
//	{
//		for(int j=0;j<columns;j++)
//		{
//			subtraction[i][j]=matrix1[i][j]-matrix2[i][j];
//		}
//}
//	
//	for(int r[]:addition) {
//		System.out.println(Arrays.toString(r));
//	}
//	
//	for(int r[]:subtraction) {
//		System.out.println(Arrays.toString(r));
//	}
		
		// transpose of matrix
//		int matrix[][]=new int[rows][columns];
//		int transposeMatrix[][]=new int[columns][rows];
//		System.out.println("Enter the values of matrix");
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<columns;j++) {
//				matrix[i][j]=scanner.nextInt();
//			}
//		}
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<columns;j++) {
//				transposeMatrix[j][i]=matrix[i][j];
//			}
//		}
//		
//		for(int r[]:matrix) {
//			System.out.println(Arrays.toString(r));
//		}
//		for(int r[]:transposeMatrix) {
//			System.out.println(Arrays.toString(r));
//		}
		
	// multiplication of matrix
		System.out.println("Enter rows of first matrix : ");
		int rows1=scanner.nextInt();
		System.out.println("Enter columns of first matrix which is also row of second matrix");
		int col1row2=scanner.nextInt();
		System.out.println("Enter columns of second matrix :");
		int col2=scanner.nextInt();
		int matrix1[][]=new int[rows1][col1row2];
		int matrix2[][]=new int[col1row2][col2];
		int product[][]=new int[rows1][col2];
		
		
		System.out.println("Enter values of first Matrix :");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<col1row2;j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter values of Second Matrix :");
		for(int i=0;i<col1row2;i++) {
			for(int j=0;j<col2;j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Product of matrix 1 * matrix 2 :");
		
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1row2;k++) {
					product[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
				System.out.println();
			}
		}
		
		for(int[] r:product) {
			System.out.println(Arrays.toString(r));
		}
}
}
