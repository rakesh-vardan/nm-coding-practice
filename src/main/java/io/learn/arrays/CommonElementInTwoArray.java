package io.learn.arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInTwoArray 
{
	public static void main(String[] args) 
	{
		int array1[]= {1, 2, 3, 4, 5}; 
		int array2[]= {4, 5, 6, 7, 8};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array1[i]==array2[j])
				{
					list.add(array1[i]);
				}
			}
		}
		System.out.println(list);
	}
}
