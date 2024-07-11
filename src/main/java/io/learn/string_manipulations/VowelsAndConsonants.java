package io.learn.string_manipulations;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String str1 = "Hello";
		int vowel = 0;
		int consonant = 0;
		for(int j=0; j<str1.length(); j++)
		{
			if(str1.charAt(j) == 'a' || str1.charAt(j) == 'e' || str1.charAt(j) == 'i' || str1.charAt(j) == 'o' || str1.charAt(j) == 'u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println();
		System.out.println("No. of Vowel's are: " + vowel);
		System.out.println("No. of Consonant's are: " + consonant);

	}

}
