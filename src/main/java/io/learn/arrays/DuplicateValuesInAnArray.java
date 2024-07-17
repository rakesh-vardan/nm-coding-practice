package io.learn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValuesInAnArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		List<Integer> list = new ArrayList<Integer>();
		int count=0;
		System.out.println("Original list is: " + Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(list.isEmpty() || !list.contains(arr[i]))
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
					}
					if(count>=2)
					{
						list.add(arr[i]);
						count=0;
					}
				}
				count=0;
			}
		}
		
		System.out.println("Duplicate values are: " + list);
	}
}
