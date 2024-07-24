package io.learn.arrays;

import java.util.Scanner;

public class ArrayContainsSpecificElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to check: ");
		int eleCheck = sc.nextInt();
		int arr[] = {1,2,3,4,5};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == eleCheck)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("\"" + eleCheck + "\" Value is present in the array");
		}
		else
		{
			System.out.println("\"" + eleCheck + "\" Value is not present in the array");
		}
	}
}
