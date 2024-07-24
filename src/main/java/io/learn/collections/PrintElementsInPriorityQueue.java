package io.learn.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrintElementsInPriorityQueue 
{
	public static void main(String[] args) 
	{
		Queue<String> colors = new PriorityQueue<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		System.out.println("Original list is: " + colors);
	}
}
