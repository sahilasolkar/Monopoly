package game.components;

public class Dice {
	
	int max = 6;
	int min = 1;
	
	public int rolldice()
	{
		
		int b = (int)(Math.random()*(max-min+1)+min);
		
		
		System.out.println("the number on the dice is => "+b);
		
		return b;
		
	}

}
