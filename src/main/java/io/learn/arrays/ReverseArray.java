package io.learn.arrays;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
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
		System.out.println("Reversed array is: " + Arrays.toString(arr));
	}
}
