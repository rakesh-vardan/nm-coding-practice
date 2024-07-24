package io.learn.arrays;

public class CalculateEvenAndOddNumbers 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int even =0, odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				odd++;
			}
			else
			{
				even++;
			}
		}
		System.out.println("Even: " + even + "  Odd: " + odd);
	}
}
