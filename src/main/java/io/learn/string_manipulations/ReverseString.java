package io.learn.string_manipulations;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("Original String is: " + str);
		String revstr = "";
		
		for(int i=0; i<str.length();i++)
		{
			revstr = str.charAt(i) + revstr;
		}
		System.out.println("Reverse String is: " + revstr);

	}

}
