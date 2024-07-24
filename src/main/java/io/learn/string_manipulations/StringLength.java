package io.learn.string_manipulations;

public class StringLength 
{
	public static void main(String[] args) 
	{
		String str7 = "Hello";
		int count=0;
		for(int i=0; i<str7.length(); i++)
		{
			count++;
		}
		System.out.println("Length of word is: " + count);
	}
}
