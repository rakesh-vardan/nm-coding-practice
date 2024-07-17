package io.learn.arrays;

import java.util.Arrays;

public class MoveAllZeroToEndOfAnArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {0, 1, 0, 3, 12};
		int count=0;
		System.out.println("Original array is: " + Arrays.toString(arr));
		int newArray[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newArray[count] = arr[i];
				count++;
			}
		}
		System.out.println("Updated array is: " + Arrays.toString(newArray));
	}
}
