package io.learn.string_manipulations;

public class StringContainsNumericCharacters 
{
	public static void main(String[] args) 
	{
		System.out.println();
		String str11 = "12345";
		int alphabetic=0;
		int numeric=0;
		for(int d=0;d<str11.length();d++)
		{
			if(Character.isAlphabetic(str11.charAt(d)))
			{
				alphabetic++;
			}
			else
			{
				numeric++;
			}
		}
		if(alphabetic==5)
		{
			System.out.println("The string contains only Alphabetic characters");
		}
		else if(numeric==5)
		{				
			System.out.println("String contains Numeric characters");			
		}
		else
		{
			System.out.println("String contains both numeric and alphabetic characters");
		}
	}
}
