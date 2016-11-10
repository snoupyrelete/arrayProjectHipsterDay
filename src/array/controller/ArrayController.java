package array.controller;

import array.model.Hipster;


public class ArrayController
{
	private String[] words;
	private Hipster[] hipsters;
	private int[]numbers;
	
	
	public ArrayController()
	{
		numbers = new int[20];
		words = new String[5];
		hipsters = new Hipster[5];
	}
	
	public void start()
	{
		// You replace the originally null values of the array, each with a name of "Hipster #" (0 through n-1).
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + index);
		}
		
		for(Hipster currentHipster: hipsters)
		{
			System.out.println(currentHipster);
		}
		
		for(int index = 0; index < numbers.length; index++)
		{
			
		}
		
		for(int index = 0; index < words.length; index++)
		{
			
		}
	}
}
