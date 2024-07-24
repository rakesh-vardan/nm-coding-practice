package io.learn.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IterateElementsInTreeSet 
{
	public static void main(String[] args) 
	{
		Set<String> colors = new TreeSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		for(String color : colors)
		{
			System.out.print(color + " ");
		}
	}
}
