package io.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class ReadElementsInArrayList 
{
	public static void main(String[] args) 
	{
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		for(int i=0; i<color.size();i++)
		{
			System.out.print(color.get(i) + " ");
		}
	}
}
