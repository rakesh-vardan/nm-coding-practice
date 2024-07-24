package io.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class AddStringAndPrintCollection 
{
	public static void main(String[] args) 
	{
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.print("[");
		for(int i=0; i<color.size();i++)
		{
			if(i== color.size()-1)
			{
				System.out.print("\"" + color.get(i)+"\"" + "]");
			}
			else
			{
				System.out.print("\"" + color.get(i)+"\"," + " ");
			}
		}
	}
}
