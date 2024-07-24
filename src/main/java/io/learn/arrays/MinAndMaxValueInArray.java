package io.learn.arrays;

import java.util.Arrays;

public class MinAndMaxValueInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {3,9,2,4,10};
		int a;
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;
				}
			}
		}
		System.out.println("Updated array is : " + Arrays.toString(arr));
		int min = arr[0];
		int max = arr[arr.length-1];
		System.out.println("Minimum value in Array is: " + min);
		System.out.println("Maximum value in Array is: " + max);
	}
}
