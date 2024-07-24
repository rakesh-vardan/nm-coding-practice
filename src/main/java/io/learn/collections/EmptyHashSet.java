package io.learn.collections;

import java.util.HashSet;
import java.util.Set;

public class EmptyHashSet 
{
	public static void main(String[] args) 
	{
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println("Original list is: " + color);
		color.clear();
		System.out.println("Updated list is: " + color);
	}
}
