package game.components;

public class TaxCell extends Cell{
	
	String name;
	int price;

	public TaxCell(int cellno, String name, int price) {
		super(cellno);
		this.name = name;
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printcell() {
		// TODO Auto-generated method stub
		System.out.printf(" %8.8s|", name);
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}

}
