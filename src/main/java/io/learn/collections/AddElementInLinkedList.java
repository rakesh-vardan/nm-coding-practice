package io.learn.collections;

import java.util.LinkedList;
import java.util.List;

public class AddElementInLinkedList 
{
	public static void main(String[] args) 
	{
		List<String> colors = new LinkedList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		System.out.println("Original list is: " + colors);
		
		colors.add("Yellow");
		System.out.println("Updated list is: " + colors);
	}
}
