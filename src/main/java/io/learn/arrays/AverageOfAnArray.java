package io.learn.arrays;

import java.util.Arrays;

public class AverageOfAnArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int add=0;
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			add = add + arr[i];
		}
		float avg;
		avg = add/5;
		System.out.println("Average of given array is: " + avg);
	}
}
