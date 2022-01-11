package game.components;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	
	
	//board
	Board monopolyBoard  = new Board();
	
	//players
	Player p1 = new Player('A', 0);
	Player p2 = new Player('B', 2);
	Player p3 = new Player('C', 4);
	Player p4 = new Player('D', 6);
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	Player[] p = {p1,p2,p3,p4};
	
	//dice
	Dice dice = new Dice();
	int dicenum;
	
	public void evaluate(Player a[])
	{
		ArrayList<Player> winner = new ArrayList<Player>();
		Player w = null;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i].getBalance()>=a[i+1].getBalance())
			{
				w = a[i];
			}
			else
			{
				w = a[i+1];
			}
		}
		System.out.println("\n The winner is => "+w.getName()+" with a balance of rs - "+w.getBalance());
	}
	
	public void startGame()
	{
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.println("WELCOME TO THE GAME OF MONOPOLY \n");
		System.out.println("******************************* \n");
		
		
		
		int status=1;
		int choice, menuestat;
		
		while(status!=0)
		{
			//checks if the player is still in the game. If yes then he can continue the game or else he is eliminated
			for(int k=0;k<players.size();k++)
			{
				if(!p[k].isactive)
				{
					players.remove(k);
				}
			}
			for(int j=0;j<players.size();j++)
			{
				menuestat=1;
				while(menuestat!=0)
				{
					System.out.println("***************************");
					System.out.println("menue for player - "+p[j].getName());
					System.out.println("1. show player details");
					System.out.println("2. rolldice");
					System.out.println("***************************");
					menuestat=sc.nextInt();
					switch(menuestat)
					{
					case 1:
						p[j].showdetails();
						break;
					case 2:
				    	menuestat=0;
						break;
					}
				}
				System.out.println("player "+p[j].getName()+" roles the dice. Press '1' to roll the dice \n");
				input = sc.nextInt();
				
				if(input==1) 
				{
					dicenum = dice.rolldice();
					System.out.println("player "+p[j].getName()+" gets the number"+dicenum+"\n");
					
					p[j].updatePos(dicenum);
					
					monopolyBoard.clear(p[j]);
					
					monopolyBoard.update(p[j]);
					
					monopolyBoard.display();
					
					p[j].showdetails();

				}
				else
				{
					System.out.println("enter the correct number");	
				}
			}
			System.out.println("press 0 to exit or press 1 to continue");
			status=sc.nextInt();
		}
		//here calculate the score and announce the winner (richest person on the current game status wins)
		evaluate(p);
		System.out.println("game terminated!");
	}
	
	

}
