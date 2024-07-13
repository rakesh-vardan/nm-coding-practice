package io.learn.arrays;

import java.util.Arrays;

public class SumOfElementsInAnArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int fact=0;
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			fact = fact + arr[i];
		}
		System.out.println("Factorial of given array is: " + fact);
	}
}
