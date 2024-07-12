package io.learn.string_manipulations;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachCharacterInString 
{
	public static void main(String[] args) 
	{
		String str10= "Hello";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int countwords = 0;
		for(int b=0;b<str10.length();b++)
		{
			if(map.isEmpty() || !map.containsKey(str10.charAt(b)))
			{
				for(int c=0;c<str10.length();c++)
				{
					if(str10.charAt(b) == str10.charAt(c))
					{
						countwords++;
					}
				}
				map.put(str10.charAt(b), countwords);
				countwords=0;
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
