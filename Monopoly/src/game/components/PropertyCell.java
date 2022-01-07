package game.components;

import java.util.Scanner;

public class PropertyCell extends Cell {
	
	String fname, lname;
	int price, rent;
	Player owner;
	boolean istaken=false;
	
	public PropertyCell(int cellno, String fname, String lname, int price, int rent) {
		super(cellno);
		this.fname=fname;
		this.lname=lname;
		this.price=price;
		this.rent=rent;
		// TODO Auto-generated constructor stub
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isIstaken() {
		return istaken;
	}

	public void setIstaken(boolean istaken) {
		this.istaken = istaken;
	}

	

	public void printcell() {
		// TODO Auto-generated method stub
		System.out.printf(" %8.8s|", fname);
	}

	@Override
	public void updateplayer(char n, boolean clear) {
		// TODO Auto-generated method stub
		
	}
	
	public void updateOwnership(Player owner)
	{
		if(istaken)
		{
			System.out.println("\n cannot buy the property. Already taken! \n");
		}
		else
		{
			System.out.println("setting up the owner!");
			setOwner(owner);
			this.istaken = true;
		}
		
	}
	
	public void withdrawOwnership(Player owner)
	{
		
		if(owner.name == this.owner.getName())
		{
			this.owner = null;
			this.istaken = false;
		}
		else
		{
			System.out.println("\n cannot withdraw the ownership.\n The provided player doesnot own the property.\n");
		}
	}
	
	
	public boolean istaken()
	{
		if(istaken) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
}
