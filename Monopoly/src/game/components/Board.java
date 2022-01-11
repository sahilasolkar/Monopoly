package game.components;

import java.util.ArrayList;

public class Board {
	
	Cell[][] c = 
		{{new Emptycell(1), new ParkingCell(20, "freeParking"), new PropertyCell(21, "Kentucky","avenue",220, 90 ), new ChanceCell(2), new PropertyCell(23, "Indiana","avenue",220, 90 ), new PropertyCell(24, "Illinois","avenue",240, 100 ), new PropertyCell(25, "Railroad","B.&O.",200, 50 ), new PropertyCell(26, "Atlantic","avenue",260, 110 ), new PropertyCell(27, "Ventnor","avenue",260, 110 ), new PropertyCell(28, "WaterWorks","", 150, 50),new PropertyCell(29, "Marvin","Gardens", 280, 120), new JailCell(30, "goToJail"), new Emptycell(1)},
		{new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1)},
		{new Emptycell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new Emptycell(1)},
		{new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(19, "NewYork", "Avenue", 200, 80), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(31, "Pacific", "Avenue", 300, 130)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(18, "tennese", "Avenue", 180, 70), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(32, "Carolina", "Avenue", 300, 130)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new ComunityChestCell(2), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new ComunityChestCell(3)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(16, "St.James", "Place", 180, 70), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(34, "Pensylvania", "Avenue", 320, 150)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(15, "railroad", "pensylvania", 200, 50), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(35, "shortLine", "", 200, 50)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(14, "Virginia", "Avenue", 160, 60), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new ChanceCell(3)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(13, "States", "Avenue", 140, 50), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(37, "Park", "Place", 350, 175)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(12, "Electric", "Company", 150, 40), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new TaxCell(38, "Luxury", 100)},
		{new DividerCell(1), new DividerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new DividerCell(1), new DividerCell(1)},
		{new PropertyCell(11, "St.Charles", "Place", 140, 50), new PlayerCell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new Emptycell(1), new PlayerCell(1), new PropertyCell(39, "BoardWalk", "", 400, 200)},
		{new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1)},
		{new Emptycell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new PlayerCell(1), new Emptycell(1)},
		{new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1), new DividerCell(1)},
		{new Emptycell(1), new JailCell(10, "jail"), new PropertyCell(9, "Connecticut","avenue",220, 40 ), new PropertyCell(8, "Vermont","avenue",220, 30 ), new ChanceCell(1), new PropertyCell(6, "Oriental","avenue",240, 30 ), new PropertyCell(5, "Railroad","reading",200, 50), new TaxCell(4, "Income",260), new PropertyCell(3, "Baltic","avenue",260, 20), new ComunityChestCell(1),new PropertyCell(1, "mediteranian","Avenue", 280, 10), new StartCell(0, "Start"), new Emptycell(1)}};
	
	Bank sbi = new Bank("SBI", 10000000);
	
	public void display()
	{
		for (int i=0;i<=24;i++)
		{
			for (int j=0;j<=12;j++)
			{
				c[i][j].printcell();
			}
			System.out.println();
		}
	}
	
	public void update(Player p)
	{
		int pos = p.position;
		
		switch(pos)
		{
		//0-10 => down row 
		//startcell
		case 0:
			c[22][11].updateplayer(p.name, false);
			c[24][11].updatePlayer(p, sbi);
			break;
		//mediteranean avenue
		case 1:
			c[22][10].updateplayer(p.name, false);
			if(c[24][10].istaken())
			{
				if(p.payRent((PropertyCell) c[24][10]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][10]);
			}
			break;
		//community chest 
		case 2:
			((ComunityChestCell) c[24][9]).revealCommunityChest(p, c, sbi);
			break;
		//baltic avenue
		case 3:
			c[22][8].updateplayer(p.name, false);
			if(c[24][8].istaken())
			{
				if(p.payRent((PropertyCell) c[24][8]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][8]);
			}
			break;
		//income tax
		case 4:
			c[22][7].updateplayer(p.name, false);
			sbi.incomeTax(p);
			break;
		//reading railroad
		case 5:
			c[22][6].updateplayer(p.name, false);
			if(c[24][6].istaken())
			{
				if(p.payRent((PropertyCell) c[24][6]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][6]);
			}
			break;
		//oriental avenue
		case 6:
			c[22][5].updateplayer(p.name, false);
			if(c[24][5].istaken())
			{
				if(p.payRent((PropertyCell) c[24][5]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][5]);
			}
			break;
		//chance
		case 7:
			((ChanceCell) c[24][4]).revealChance(p, c, sbi);
			break;
		//vermont avenue
		case 8:
			c[22][3].updateplayer(p.name, false);
			if(c[24][3].istaken())
			{
				if(p.payRent((PropertyCell) c[24][3]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][3]);
			}
			break;
		//connecticut avneue
		case 9:
			c[22][2].updateplayer(p.name, false);
			if(c[24][2].istaken())
			{
				if(p.payRent((PropertyCell) c[24][2]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[24][2]);
			}
			break;
		//in jail, just visiting
		case 10:
			c[22][1].updateplayer(p.name, false);
			break;
			
		//11-20 => left column
		//st charles
		case 11:
			c[20][1].updateplayer(p.name, false);
			if(c[20][0].istaken())
			{
				if(p.payRent((PropertyCell) c[20][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[20][0]);
			}
			break;
		//electric company
		case 12:
			c[18][1].updateplayer(p.name, false);
			if(c[18][0].istaken())
			{
				if(p.payRent((PropertyCell) c[18][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[18][0]);
			}
			break;
		//states avenue
		case 13:
			c[16][1].updateplayer(p.name, false);
			if(c[16][0].istaken())
			{
				if(p.payRent((PropertyCell) c[16][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[16][0]);
			}
			break;
		//virginia avenue
		case 14:
			c[14][1].updateplayer(p.name, false);
			if(c[14][0].istaken())
			{
				if(p.payRent((PropertyCell) c[14][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[14][0]);
			}
			break;
		//pennsylvania railroad
		case 15:
			c[12][1].updateplayer(p.name, false);
			if(c[12][0].istaken())
			{
				if(p.payRent((PropertyCell) c[12][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[12][0]);
			}
			break;
		//st. james place
		case 16:
			c[10][1].updateplayer(p.name, false);
			if(c[10][0].istaken())
			{
				if(p.payRent((PropertyCell) c[10][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[10][0]);
			}
			break;
		//community chest
		case 17:
			((ComunityChestCell) c[8][0]).revealCommunityChest(p, c, sbi);
			break;
		//tenessee avenue
		case 18:
			c[6][1].updateplayer(p.name, false);
			if(c[6][0].istaken())
			{
				if(p.payRent((PropertyCell) c[6][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[6][0]);
			}
			break;
		//new york
		case 19:
			c[4][1].updateplayer(p.name, false);
			if(c[4][0].istaken())
			{
				if(p.payRent((PropertyCell) c[4][0]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[4][0]);
			}
			break;
		//parking
		case 20:
			c[2][1].updateplayer(p.name, false);
			break;
			
		//21 - 30 => top row
		//kentucky avenue
		case 21:
			c[2][2].updateplayer(p.name, false);
			if(c[0][2].istaken())
			{
				if(p.payRent((PropertyCell) c[0][2]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][2]);
			}
			break;
		//chance
		case 22:
			((ChanceCell) c[0][3]).revealChance(p, c, sbi);
			break;
		//indiana avenue
		case 23:
			c[2][4].updateplayer(p.name, false);
			if(c[0][4].istaken())
			{
				if(p.payRent((PropertyCell) c[0][4]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][4]);
			}
			break;
		//illinois avenue
		case 24:
			c[2][5].updateplayer(p.name, false);
			if(c[0][5].istaken())
			{
				if(p.payRent((PropertyCell) c[0][5]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][5]);
			}
			break;
		//B & O rail road
		case 25:
			c[2][6].updateplayer(p.name, false);
			if(c[0][6].istaken())
			{
				if(p.payRent((PropertyCell) c[0][6]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][6]);
			}
			break;
		//atlantic avenue
		case 26:
			c[2][7].updateplayer(p.name, false);
			if(c[0][7].istaken())
			{
				if(p.payRent((PropertyCell) c[0][7]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][7]);
			}
			break;
		//ventnor avenue
		case 27:
			c[2][8].updateplayer(p.name, false);
			if(c[0][8].istaken())
			{
				if(p.payRent((PropertyCell) c[0][8]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][8]);
			}
			break;
		//water works
		case 28:
			c[2][9].updateplayer(p.name, false);
			if(c[0][9].istaken())
			{
				if(p.payRent((PropertyCell) c[0][9]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][9]);
			}
			break;
		//marvin garden
		case 29:
			c[2][10].updateplayer(p.name, false);
			if(c[0][10].istaken())
			{
				if(p.payRent((PropertyCell) c[0][10]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[0][10]);
			}
			break;
		//go to jail
		case 30:
			c[2][11].updateplayer(p.name, false);
			break;
			
		//31-39 => right column
		//pacific avenue
		case 31:
			c[4][11].updateplayer(p.name, false);
			if(c[4][12].istaken())
			{
				if(p.payRent((PropertyCell) c[4][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[4][12]);
			}
			break;
		//north carolina
		case 32:
			c[6][11].updateplayer(p.name, false);
			if(c[6][12].istaken())
			{
				if(p.payRent((PropertyCell) c[6][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[6][12]);
			}
			break;
		//community chest
		case 33:
			((ComunityChestCell) c[8][12]).revealCommunityChest(p, c, sbi);
			break;
		//pennsylvania avenue
		case 34:
			c[10][11].updateplayer(p.name, false);
			if(c[10][12].istaken())
			{
				if(p.payRent((PropertyCell) c[10][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[10][12]);
			}
			break;
		//short line
		case 35:
			c[12][11].updateplayer(p.name, false);
			if(c[12][12].istaken())
			{
				if(p.payRent((PropertyCell) c[12][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[12][12]);
			}
			break;
		//chance
		case 36:
			((ChanceCell) c[14][12]).revealChance(p, c, sbi);
			break;
		//park place
		case 37:
			c[16][11].updateplayer(p.name, false);
			if(c[16][12].istaken())
			{
				if(p.payRent((PropertyCell) c[16][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[16][12]);
			}
			break;
		//luxury tax
		case 38:
			c[18][11].updateplayer(p.name, false);
			sbi.luxuryTax(p);
			break;
		//boardwalk
		case 39:
			c[20][11].updateplayer(p.name, false);
			if(c[20][12].istaken())
			{
				if(p.payRent((PropertyCell) c[20][12]))
				{
					break;
				}
				else
				{
					System.out.println("Player "+p.getName()+" cannot pay the rent");
					p.eliminatePlayer();
				}
			}
			else
			{
				sbi.dealproperty(p, (PropertyCell)c[20][12]);
			}
			break;
		}
	}
	
	public void clear(Player p)
	{
		int prevpos = p.prevpos;
		
		switch(prevpos)
		{
		//0-10 => down row 
		case 0:
			c[22][11].updateplayer(p.name, true);
			break;
		case 1:
			c[22][10].updateplayer(p.name, true);
			break;
		case 2:
			c[22][9].updateplayer(p.name, true);
			break;
		case 3:
			c[22][8].updateplayer(p.name, true);
			break;
		case 4:
			c[22][7].updateplayer(p.name, true);
			break;
		case 5:
			c[22][6].updateplayer(p.name, true);
			break;
		case 6:
			c[22][5].updateplayer(p.name, true);
			break;
		case 7:
			c[22][4].updateplayer(p.name, true);
			break;
		case 8:
			c[22][3].updateplayer(p.name, true);
			break;
		case 9:
			c[22][2].updateplayer(p.name, true);
			break;
		case 10:
			c[22][1].updateplayer(p.name, true);
			break;
			
		//11-20 => left column
		case 11:
			c[20][1].updateplayer(p.name, true);
			break;
		case 12:
			c[18][1].updateplayer(p.name, true);
			break;
		case 13:
			c[16][1].updateplayer(p.name, true);
			break;
		case 14:
			c[14][1].updateplayer(p.name, true);
			break;
		case 15:
			c[12][1].updateplayer(p.name, true);
			break;
		case 16:
			c[10][1].updateplayer(p.name, true);
			break;
		case 17:
			c[8][1].updateplayer(p.name, true);
			break;
		case 18:
			c[6][1].updateplayer(p.name, true);
			break;
		case 19:
			c[4][1].updateplayer(p.name, true);
			break;
		case 20:
			c[2][1].updateplayer(p.name, true);
			break;
		
		//21 - 30 => top row
			
		case 21:
			c[2][2].updateplayer(p.name, true);
			break;
		case 22:
			c[2][3].updateplayer(p.name, true);
			break;
		case 23:
			c[2][4].updateplayer(p.name, true);
			break;
		case 24:
			c[2][5].updateplayer(p.name, true);
			break;
		case 25:
			c[2][6].updateplayer(p.name, true);
			break;
		case 26:
			c[2][7].updateplayer(p.name, true);
			break;
		case 27:
			c[2][8].updateplayer(p.name, true);
			break;
		case 28:
			c[2][9].updateplayer(p.name, true);
			break;
		case 29:
			c[2][10].updateplayer(p.name, true);
			break;
		case 30:
			c[2][11].updateplayer(p.name, true);
			break;
			
		//31-39 => right column
		case 31:
			c[4][11].updateplayer(p.name, true);
			break;
		case 32:
			c[6][11].updateplayer(p.name, true);
			break;
		case 33:
			c[8][11].updateplayer(p.name, true);
			break;
		case 34:
			c[10][11].updateplayer(p.name, true);
			break;
		case 35:
			c[12][11].updateplayer(p.name, true);
			break;
		case 36:
			c[14][11].updateplayer(p.name, true);
			break;
		case 37:
			c[16][11].updateplayer(p.name, true);
			break;
		case 38:
			c[18][11].updateplayer(p.name, true);
			break;
		case 39:
			c[20][11].updateplayer(p.name, true);
			break;
		}	
	}
}