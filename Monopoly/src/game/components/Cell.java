package game.components;

public abstract class Cell {
	String fname;
	int cellno;
	int rent;
	int price;
	Player owner;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	public int getCellno() {
		return cellno;
	}
	public void setCellno(int cellno) {
		this.cellno = cellno;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cell(int cellno) {
		super();
		this.cellno = cellno;
	}
	public abstract void printcell();
	public void updateplayer(char n, boolean clear)
	{
		
	}
	public void updatePlayer(Player p,Bank bank)
	{
		
	}
	public void updateOwnership(Player owner)
	{
		
	}
	public boolean istaken()
	{
		return true;
	}

}
