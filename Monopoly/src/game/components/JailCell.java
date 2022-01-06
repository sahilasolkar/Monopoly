package game.components;

public class JailCell extends Cell {
	
	String name;

	public JailCell(int cellno, String name) {
		super(cellno);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public void printcell() {
		// TODO Auto-generated method stub
		System.out.printf(" %8.8s|", name);
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}
	
	public void lockup(Player p)
	{
		
	}

}
