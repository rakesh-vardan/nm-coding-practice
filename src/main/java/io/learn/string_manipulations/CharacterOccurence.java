package io.learn.string_manipulations;

public class CharacterOccurence 
{
	public static void main(String[] args) 
	{
		String str9 = "Hello";
		int count=0;
		for(int a=0; a<str9.length(); a++)
		{
			if(str9.charAt(a)=='l')
			{
				count++;
			}
		}
		System.out.println( "No. of times 'l' is repeated is: " +count);
	}
}
