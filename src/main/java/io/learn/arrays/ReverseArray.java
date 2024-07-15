package io.learn.arrays;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {4,3,5,1,2};
		int newArr[]= new int[arr.length];
		System.out.println("Original array is: " + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			for(int j=arr.length-1; j>=0;j--)
			{
				newArr[i] = arr[j];
				i++;
			}
			break;
		}
		System.out.println("Reversed array is: " + Arrays.toString(newArr));
	}
}
