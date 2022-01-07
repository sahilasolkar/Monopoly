package game.components;

public class PlayerCell extends Cell {
	
	StringBuilder s = new StringBuilder("|        |");
	
	public PlayerCell(int cellno) {
		super(cellno);
		// TODO Auto-generated constructor stub
	}

	public void printcell() {
		// TODO Auto-generated method stub
		System.out.print(s);	
	}

	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		if(clear)
		{
			if(n=='A')
			{
				s.setCharAt(1, ' ');
			}
			else if(n=='B')
			{
				s.setCharAt(3, ' ');
			}
			else if(n=='C')
			{
				s.setCharAt(5, ' ');
			}
			else if(n=='D')
			{
				s.setCharAt(7, ' ');
			}
		}
		else
		{
			if(n=='A')
			{
				s.setCharAt(1, 'A');
			}
			else if(n=='B')
			{
				s.setCharAt(3, 'B');
			}
			else if(n=='C')
			{
				s.setCharAt(5, 'C');
			}
			else if(n=='D')
			{
				s.setCharAt(7, 'D');
			}
		}
	}
	
	
}
