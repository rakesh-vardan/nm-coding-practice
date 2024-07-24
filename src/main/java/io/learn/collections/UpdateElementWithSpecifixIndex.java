package io.learn.collections;

import java.util.LinkedList;
import java.util.List;

public class UpdateElementWithSpecifixIndex 
{
	public static void main(String[] args) 
	{
		List<String> color = new LinkedList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println("Original list is: " + color);
		color.set(1, "Yellow");
		System.out.println("Updated list is: " + color);
	}
}
