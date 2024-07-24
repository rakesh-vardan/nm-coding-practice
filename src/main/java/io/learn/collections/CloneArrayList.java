package io.learn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CloneArrayList 
{
	public static void main(String[] args) 
	{
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println("Original list is: " + color);
		List<String> colorUpdates = new ArrayList<String>(color);
		System.out.println("Cloned list is: " + colorUpdates);
	}
}
