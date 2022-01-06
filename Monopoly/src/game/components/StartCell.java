package game.components;

public class StartCell extends Cell {
	
	String name;

	public StartCell(int cellno, String name) {
		super(cellno);
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public void printcell() {
		// TODO Auto-generated method stub
		System.out.println("  start  |");
	}

	
	
	public void updateplayer(Player p,Bank bank)
	{
		bank.paySalary(p);
		System.out.println("A salary of "+bank.salary+" was credited to "+p.name+ " by - "+ bank.name);
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}

}
