package io.learn.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterateElementsInHashSet 
{
	public static void main(String[] args) 
	{
		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		System.out.print("\"");
		Iterator<String> iterator = colors.iterator() ;
		for(String color : colors)
		{
			System.out.print(color +" ");
		}
		System.out.print("\"");
	}
}
