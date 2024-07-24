package io.learn.string_manipulations;

public class StringContainsCertainCharacter 
{
	public static void main(String[] args) 
	{
		String str3 = "Hello";
		for(int k=0; k<str3.length(); k++)
		{
			if(str3.charAt(k) == 'o')
			{
				System.out.println("The string " + str3 +" contains the character 'o'");
			}
		}
	}
}
