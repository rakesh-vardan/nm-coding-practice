package io.learn.arrays;

import java.util.Arrays;

public class MinAndMaxValueInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {3,2,5,1,4};
		int a;
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;
				}
			}
		}
		System.out.println("Maximum value in Array is: " + arr[0]);
		System.out.println("Minimum value in Array is: " + arr[4]);
	}
}
