package io.learn.arrays;

import java.util.Arrays;

public class SumOfElementsInAnArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int sum=0;
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of given array is: " + sum);
	}
}
