package io.learn.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CovertHashSetToArray 
{
	public static void main(String[] args) 
	{
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println("Original list is: " + color);
		String colorArray[] = new String[color.size()];
		color.toArray(colorArray);
		System.out.println("List in the Array is: " + Arrays.toString(colorArray));
	}
}
