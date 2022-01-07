package game.components;

import java.util.Random;

public class ComunityChestCell extends Cell{
	
	int bankerror = 200;
	int doctorsfee = 50;
	int saleOfStock = 50;
	int birthdaymoney = 10;
	int hospitalfees = 100;
	int schoolfees = 50;
	int consultancyfees = 25;
	int beautycontestprize = 10;
	int inherit = 100;
	int incometaxrefund = 20;
	int lifeinsurance = 100;

	public ComunityChestCell(int cellno) {
		super(cellno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printcell() {
		// TODO Auto-generated method stub
		System.out.print("com chest|");
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub	
	}
	
	public void revealCommunityChest(Player player, Cell[][] c, Bank bank)
	{
		Random random = new Random();
		int shuffle = random.nextInt(14);
		switch(shuffle)
		{
		case 0://advance to go
			System.out.println("COMMUNITY CHEST => Advance to nearest utility.");
			advanceToGo((PlayerCell)c[22][11], (StartCell)c[24][11], player, bank);
			break;
		case 1://bank error
			System.out.println("COMMUNITY CHEST => Bank error in your favour, collect 200");
			updateposition(player, c);
			player.credit(bankerror);
			break;
		case 2://doctors fee
			System.out.println("COMMUNITY CHEST => doctors fee - 50rs");
			updateposition(player, c);
			player.debit(doctorsfee);
			break;
		case 3://from sale of stock you get 50
			System.out.println("COMMUNITY CHEST => from sale of stock you get 50rs");
			updateposition(player, c);
			player.credit(saleOfStock);
			break;
		case 4://go to jail, do not collect 200
			System.out.println("COMMUNITY CHEST => go to jail, do not collect 200 ");
			advanceToJail((PlayerCell)c[22][1], (JailCell)c[24][1], player);
			break;
		case 5://holiday fund matures, recieves 100
			System.out.println("COMMUNITY CHEST => holiday fund matures, recieves 100");
			updateposition(player, c);
			bank.holidayfund(player);
			break;
		case 6://income tax refund - 20
			System.out.println("COMMUNITY CHEST => income tax refund - 20");
			updateposition(player, c);
			bank.incometaxrefund(player, incometaxrefund);
			break;
		case 7://its your birthday, collect 10
			System.out.println("COMMUNITY CHEST => its your birthday, collect 10");
			updateposition(player, c);
			player.credit(birthdaymoney);
			break;
		case 8://life insurance matures, collect 100
			System.out.println("COMMUNITY CHEST => life insurance matures, collect 100");
			updateposition(player, c);
			bank.lifeInsuranceMaturityPay(player, lifeinsurance);
			break;
		case 9://pay hospital fees of 100
			System.out.println("COMMUNITY CHEST => pay hospital fees of 100");
			updateposition(player, c);
			player.debit(hospitalfees);
			break;
		case 10://pay school fees of 50
			System.out.println("COMMUNITY CHEST => pay school fees of 50");
			updateposition(player, c);
			player.debit(schoolfees);
			break;
		case 11://recieve 25 consultancy fees
			System.out.println("COMMUNITY CHEST => recieve 25 consultancy fees");
			updateposition(player, c);
			player.credit(consultancyfees);
			break;
		case 12://won second price in a beauty contest, collect 10rs
			System.out.println("COMMUNITY CHEST => won second price in a beauty contest, collect 10rs");
			updateposition(player, c);
			player.credit(beautycontestprize);
			break;
		case 13://you inherit 100rs
			System.out.println("COMMUNITY CHEST => you inherit 100rs");
			updateposition(player, c);
			player.credit(inherit);
			break;
		}
	}
	
	public void advanceToGo(PlayerCell playercell, StartCell start, Player player, Bank bank)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(start.getCellno());
		bank.paySalary(player);
	}
	
	public void advanceToJail(PlayerCell playercell, JailCell jail, Player player)
	{
		playercell.updateplayer(player.name, false);
		player.setPosition(jail.getCellno());
		player.GoInJail();
	}
	
	public void updateposition(Player player, Cell[][] c)
	{
		if(this.cellno==1)
		{
			c[22][9].updateplayer(player.name, false);
		}
		else if(this.cellno==2)
		{
			c[8][1].updateplayer(player.name, false);
		}
		else if(this.cellno==3)
		{
			c[8][11].updateplayer(player.name, false);
		}
	}

}
