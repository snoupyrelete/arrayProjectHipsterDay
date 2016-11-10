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
		for (int currentInt: numbers)
		{
			System.out.println(currentInt);
		}
		System.out.println("BREAK");
		for (String currentString: words)
		{
			System.out.println(currentString);
		}
		System.out.println("BREAK");
		for (Hipster currentHipster: hipsters)
		{
			System.out.println(currentHipster);
		}
	}
}
