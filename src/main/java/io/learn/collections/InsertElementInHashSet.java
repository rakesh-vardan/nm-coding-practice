package io.learn.collections;

import java.util.HashSet;
import java.util.Set;

public class InsertElementInHashSet 
{
	public static void main(String[] args) 
	{
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println("Original Set is: " + color);
		color.add("Yellow");
		System.out.println("Updated Set is: " + color);
	}
}
