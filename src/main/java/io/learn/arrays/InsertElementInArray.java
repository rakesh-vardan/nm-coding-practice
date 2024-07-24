package io.learn.arrays;

import java.util.LinkedList;
import java.util.List;

public class InsertElementInArray 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println("Original array is: " + list);
		list.add(2, 3);
		System.out.println("Updated array is: " + list);
	}
}
