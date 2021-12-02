package game.components;

import java.util.Scanner;

public class Game {
	
	
	//board
	Board monopolyBoard  = new Board();
	
	//players
	Player p1 = new Player('A');
	Player p2 = new Player('B');
	Player p3 = new Player('C');
	Player p4 = new Player('D');
	
	Player[] p = {p1,p2,p3,p4};
	
	
	//dice
	Dice dice = new Dice();
	int dicenum;
	
	public void startGame()
	{
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		String[] menu = {
				""
		};
		
		System.out.println("WELCOME TO THE GAME OF MONOPOLY \n");
		System.out.println("******************************* \n");
		
		int status=1;
		
		while(status!=0)
		{
			for (int i = 0 ; i<p.length ; i++)
			{
			System.out.println("player one roles the dice. Press '1' to roll the dice \n");
			input = sc.nextInt();
			if(input == 1)
			{
				//player1
				
				dicenum = dice.rolldice();
				System.out.println("player one gets the number"+dicenum+"\n");
				
				p[i].updatePos(dicenum);
				
				monopolyBoard.clear(p[i].prevpos);
				
				System.out.println("the postition of player one is "+p[i].getPosition()+"\n");
				
				monopolyBoard.update(p[i].getPosition(), p[i].name);
				
				monopolyBoard.displayboard();
				
			}
			else
			{
				System.out.println("please press the right key");
			}
			}
			
			System.out.println("enter 0 to exit or else press any key to continue");
			status = sc.nextInt();
			
			
			
		}
		
		
		//here calculate the score and announce the winner (richest person on the current game status wins)
		System.out.println("game terminated!");
		
		
		
	}
	
	

}
