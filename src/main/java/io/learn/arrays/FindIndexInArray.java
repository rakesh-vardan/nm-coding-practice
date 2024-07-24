package io.learn.arrays;

import java.util.Scanner;

public class FindIndexInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to find Index of: ");
		int element = sc.nextInt();
		int arr[]= {1,2,3,4,5};
		int count=0,j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				j=i;
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Index of element " + "\"" + element + "\" is: " + j);
		}
		else
		{
			System.out.println("Element " + "\"" + element + "\" is not present in the array");
		}
	}
}
