package io.learn.string_manipulations;

public class SplitStingWithGivenDelimiters 
{
	public static void main(String[] args) 
	{
		String str12 = "Java-Programming-Language";
		String arr[] = str12.split("-");
		for(String str13 : arr)
		{
			System.out.print("\"" +str13 + "\", ");
		}
	}
}
