package PlayingConsole;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import game.components.Bank;
import game.components.Board;
import game.components.Cell;
import game.components.ChanceCell;
import game.components.ComunityChestCell;
import game.components.Dice;
import game.components.DividerCell;
import game.components.Emptycell;
import game.components.Game;
import game.components.JailCell;
import game.components.ParkingCell;
import game.components.Player;
import game.components.PlayerCell;
import game.components.PropertyCell;
import game.components.StartCell;
import game.components.TaxCell;
import java.lang.Math;
import java.util.Random;
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
		
		Game game = new Game();
		
		game.startGame();
		
		
		//testing
		//System.out.printf("   %3.3s 8.8s|\n %8.8s|\n_________|  |\n %", 60, "kentucky", "avenue");
		
		/*StringBuilder s = new StringBuilder("         |\n         |\n         |\n_________|");
		s.setCharAt(37, 'A');
		System.out.println(s);
		*/
		
		/*Cell c = new PropertyCell(1, "jf", "fj", 20);
		
		c.setRent(50);
		
		//System.out.println(c.getPrice());
		
		Player p = new Player('a', 1);
		Player x = new Player('b', 2);
		
		c.updateOwnership(p);
		
		System.out.println(c.getOwner().getName());
		
		x.payRent((PropertyCell) c);
		
		System.out.println(c.getRent());
		
		System.out.println(p.getBalance());
		System.out.println(x.getBalance());
		*/
	}
	
	

}
