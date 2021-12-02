package PlayingConsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

import game.components.Board;
import game.components.Dice;
import game.components.Game;
import game.components.Player;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board monopoly= new Board();
		
		//monopoly.displayboard();
		
		//monopoly.update();
		
		//monopoly.displayboard();
		
		
		//dice 
		Dice d = new Dice();
		
		Scanner sc = new Scanner(System.in);       // Scanner object

	    System.out.println("Enter your rollno");
	    //int rollno = sc.nextInt();
	    
	        
		
		
		Game game = new Game();
		
		game.startGame();
		
		
		
	}
	
	

}
