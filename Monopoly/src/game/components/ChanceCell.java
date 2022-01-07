package game.components;
import java.util.Random;  
public class ChanceCell extends Cell {

	public ChanceCell(int cellno) {
		super(cellno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printcell() {
		// TODO Auto-generated method stub
		System.out.print("  chance |");
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}
	
	public void revealChance(Player player, Cell[][] c, Bank bank)
	{
		Random random = new Random();
		int shuffle = random.nextInt(13);
		switch(shuffle)
		{
		case 0://advance to boardwalk
			System.out.println("CHANCE => Advance to boardwalk");
			advanceToWithoutGo((PlayerCell)c[20][11], (PropertyCell)c[20][12], player, bank);
			break;
		case 1://advance to illinois 
			System.out.println("CHANCE => Advance to illinois. If passed GO, collect 200");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[2][5], (PropertyCell)c[0][5], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithoutGo((PlayerCell)c[2][5], (PropertyCell)c[0][5], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithGo((PlayerCell)c[2][5], (PropertyCell)c[0][5], player, bank);
			}
			break;
		case 2://advance to st.charles
			System.out.println("CHANCE => Advance to St.Charles. If passed GO, collect 200");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[20][1], (PropertyCell)c[20][0], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithGo((PlayerCell)c[20][1], (PropertyCell)c[20][0], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithGo((PlayerCell)c[20][1], (PropertyCell)c[20][0], player, bank);
			}
			break;
		case 3://advance to nearest railroad
			System.out.println("CHANCE => Advance to nearest Rail Road.");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[12][1], (PropertyCell)c[12][0], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithoutGo((PlayerCell)c[2][6], (PropertyCell)c[0][6], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithGo((PlayerCell)c[22][6], (PropertyCell)c[24][6], player, bank);
			}
			break;
		case 4://advance to nearest Rail Road
			System.out.println("CHANCE => Advance to nearest Rail Road.");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[12][1], (PropertyCell)c[12][0], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithoutGo((PlayerCell)c[2][6], (PropertyCell)c[0][6], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithoutGo((PlayerCell)c[22][6], (PropertyCell)c[24][6], player, bank);
			}
			break;
		case 5://advance to nearest utility
			System.out.println("CHANCE => Advance to nearest utility. If passed GO, collect 200");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[18][1], (PropertyCell)c[18][0], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithoutGo((PlayerCell)c[2][9], (PropertyCell)c[0][9], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithoutGo((PlayerCell)c[18][1], (PropertyCell)c[18][0], player, bank);
			}
			break;
		case 6://advanc to GO
			System.out.println("CHANCE => Advance to nearest utility.");
			advanceToGo((PlayerCell)c[22][11], (StartCell)c[24][11], player, bank);
			break;
		case 7://bank pays you a dividend of 50
			if(this.cellno==1)
			{
				c[22][4].updateplayer(player.name, false);
			}
			else if(this.cellno==2)
			{
				c[2][3].updateplayer(player.name, false);
			}
			else if(this.cellno==3)
			{
				c[14][11].updateplayer(player.name, false);
			}
			System.out.println("CHANCE => bank pays you a dividend of 50");
			bank.payDividend(player);
			break;
		case 8://go back three spaces
			System.out.println("CHANCE => go back three spaces");
			if(this.cellno==1)
			{
				//to incometax
				advanceToIncomeTax((PlayerCell)c[22][7], (TaxCell)c[24][7], player, bank);
			}
			else if(this.cellno==2)
			{
				//to new york avenue
				advanceToWithoutGo((PlayerCell)c[4][1], (PropertyCell)c[4][0], player, bank);
			}
			else if(this.cellno==3)
			{
				//to community chest
				advanceToWithoutGo((PlayerCell)c[18][1], (PropertyCell)c[18][0], player, bank);
			}
			break;
		case 9:// go direct to jail, do not collect 200
			System.out.println("CHANCE=> go direct to jail, do not collect 200");
			advanceToJail((PlayerCell)c[22][1],(JailCell)c[24][1] , player);
			break;
		case 10://bank fines 15rs
			if(this.cellno==1)
			{
				c[22][4].updateplayer(player.name, false);
			}
			else if(this.cellno==2)
			{
				c[2][3].updateplayer(player.name, false);
			}
			else if(this.cellno==3)
			{
				c[14][11].updateplayer(player.name, false);
			}
			System.out.println("CHANCE=> bank fines 15");
			bank.fine(player, 15);
			break;
		case 11://go to railroad, if you pass go collect 200
			System.out.println("CHANCE => Advance to nearest Rail Road. If passed GO, collect 200");
			if(this.cellno==1)
			{
				advanceToWithoutGo((PlayerCell)c[12][1], (PropertyCell)c[12][0], player, bank);
			}
			else if(this.cellno==2)
			{
				advanceToWithoutGo((PlayerCell)c[2][6], (PropertyCell)c[0][6], player, bank);
			}
			else if(this.cellno==3)
			{
				advanceToWithGo((PlayerCell)c[22][6], (PropertyCell)c[24][6], player, bank);
			}
			break;
		case 12://collect 150 from bank
			if(this.cellno==1)
			{
				c[22][4].updateplayer(player.name, false);
			}
			else if(this.cellno==2)
			{
				c[2][3].updateplayer(player.name, false);
			}
			else if(this.cellno==3)
			{
				c[14][11].updateplayer(player.name, false);
			}
			System.out.println("CHANCE => collect 150 from the bank");
			bank.paymoney(player, 150);
			break;
		}
	}
	
	public void advanceToWithoutGo(PlayerCell playercell, PropertyCell property, Player player, Bank bank)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(property.getCellno());
		if(property.istaken())
		{
			if(player.payRent((PropertyCell) property))
			{
				System.out.println(player.getName()+" payed the rent to "+property.getOwner().getName());
			}
			else
			{
				System.out.println("Player "+player.getName()+" cannot pay the rent");
				player.eliminatePlayer();
			}
		}
		else
		{
			bank.dealproperty(player, (PropertyCell)property);
		}
	}
	
	public void advanceToWithGo(PlayerCell playercell, PropertyCell property, Player player, Bank bank)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(property.getCellno());
		bank.paySalary(player);
		if(property.istaken())
		{
			if(player.payRent((PropertyCell) property))
			{
				System.out.println(player.getName()+" payed the rent to "+property.getOwner().getName());
			}
			else
			{
				System.out.println("Player "+player.getName()+" cannot pay the rent");
				player.eliminatePlayer();
			}
		}
		else
		{
			bank.dealproperty(player, (PropertyCell)property);
		}
	}
	
	public void advanceToGo(PlayerCell playercell, StartCell start, Player player, Bank bank)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(start.getCellno());
		bank.paySalary(player);
	}
	public void advanceToIncomeTax(PlayerCell playercell, TaxCell tax, Player player, Bank bank)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(tax.getCellno());
		bank.incomeTax(player);
	}
	public void advanceToJail(PlayerCell playercell, JailCell jail, Player player)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(jail.getCellno());
		player.GoInJail();
	}

}
