package io.learn.collections;

import java.util.LinkedList;
import java.util.List;

public class IterateElementInLinkedList 
{
	public static void main(String[] args) 
	{		
		List<String> colors = new LinkedList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		for(String color : colors)
		{
			System.out.print(color + " ");
		}
	}
}
