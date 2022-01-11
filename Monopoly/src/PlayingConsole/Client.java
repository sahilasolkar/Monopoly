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
		
		Scanner sc = new Scanner(System.in);       // Scanner object   
		
		Game game = new Game();
		
		game.startGame();
		
	}
	
	

}
