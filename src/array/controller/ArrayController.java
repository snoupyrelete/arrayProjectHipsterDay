package array.controller;

import array.model.Hipster;
import array.view.HipsterFrame;

public class ArrayController
{
	//Level 2
	private String[] words = {"this","is","the","next","level","of","hipster","the","initialization","sequence"};
	private Hipster[] hipsters;
	private int[]numbers;
	private HipsterFrame appFrame;
	
	public ArrayController()
	{
	
		showHipsterLevelThree();
		//Level1
		hipsters = new Hipster[5];
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + index);
		}
		
		appFrame = new HipsterFrame(this);

	}
	
	public void start()
	{
		// You replace the originally null values of the array, each with a name of "Hipster #" (0 through n-1).
		// Objects have default value of null.
		// Primitives have default value of 0.
		
		
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
	//Level 3
	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	public String[] getWords()
	{
		return words;
	}
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	public int[] getNumbers()
	{
		return numbers;
	}
}
