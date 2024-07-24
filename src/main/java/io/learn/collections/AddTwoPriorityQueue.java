package io.learn.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class AddTwoPriorityQueue 
{
	public static void main(String[] args) 
	{
		Queue<String> colors1 = new PriorityQueue<String>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		Queue<String> colors2 = new PriorityQueue<String>();
		colors2.add("Yellow");
		colors2.add("Pink");
		colors2.add("Black");
		
		colors2.addAll(colors1);
		System.out.println("Merged elements are: " + colors2);
	}
}
