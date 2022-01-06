package game.components;

public class ParkingCell extends Cell {

	public ParkingCell(int cellno) {
		super(cellno);
		// TODO Auto-generated constructor stub
	}

	String name;

	

	public ParkingCell(int cellno, String name) {
		super(cellno);
		this.name = name;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void printcell() {
		// TODO Auto-generated method stub
		System.out.print(" parking |");
	}



	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	

}
