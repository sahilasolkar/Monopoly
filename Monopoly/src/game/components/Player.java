package game.components;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	
	char name;
	int position;
	int prevpos;
	int balance=1500;
	int id;
	boolean isactive;
	private boolean injail;
	ArrayList<PropertyCell> propertylist = new ArrayList<PropertyCell>();
	
	public void showdetails()
	{
		System.out.println("-----------------------------");
		System.out.println("\n PLAYER DETAILS OF - "+getName()+"\n");
		System.out.println("name             - "+getName());
		System.out.println("current position - "+getPosition());
		System.out.println("balance          - "+getBalance());
		if(this.isactive)
		{
			System.out.println("player status    - active");
		}
		else
		{
			System.out.println("player status    - inactive");
		}
		if(injail)
		{
			System.out.println("the player is currently in jail");
		}
		if(propertylist==null)
		{
			System.out.println("properties       -  the player doesn't own any properties");
		}
		else
		{
			System.out.println("-----------------------------");
			for(int i=0;i<propertylist.size();i++)
			{
				System.out.println(propertylist.get(i).getFname()+" "+propertylist.get(i).getLname()+"\nprice - "+propertylist.get(i).price+"\nRent price - "+ propertylist.get(i).getRent());
			}
			System.out.println("-----------------------------");
		}
		System.out.println("-----------------------------");
	}

	public Player(char name, int id) {
		super();
		this.name = name;
		this.id = id;
		activatePlayer();
	}

	public boolean isIsactive() {
		return isactive;
	}
	
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public char getName() {
		return name;
	}
	
	public void clearName()
	{
		this.name=' ';
	}


	public void setName(char name) {
		this.name = name;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAllProperties()
	{
		for(int i=0;i<propertylist.size();i++)
		{
			System.out.println(propertylist.get(i).fname);
		}
	}
	
	
	public void updatePos(int addon)
	{
		int temp;
		
		prevpos = position;
		
		//System.out.println("prepos = "+prevpos);
		
		position = position + addon;
		
		//System.out.println("pos = "+position);
		if (position ==40)
		{
			position = 0;
			return;
		}
		if (position >40)
		{
			temp = position - 40;
			position = temp;
			return;
		}

	}
	
	public boolean payRent(PropertyCell property)
	{
		int bal = this.balance;
		bal = bal - property.rent;
		if(bal>0)
		{
			this.balance = this.balance-property.rent;
	        property.owner.balance = property.owner.balance + property.rent;
			System.out.println("Player "+name+" payed a rent of "+property.rent+" for the property - "+property.fname);
			return true;
		}
		else
		{
			System.out.println("insufficient balance!");
			return false;
		}
	}
	
	public boolean isInJail()
	{
		if(injail)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void credit(int amount)
	{
		this.balance = this.balance+amount;
	}
	public void debit(int amount)
	{
		this.balance = this.balance-amount;
	}
	
	public void GoInJail()
	{
		this.injail=true;
	}
	
	public void comeOutOfJail()
	{
		this.injail = false;
	}
	
	public void eliminatePlayer()
	{
		setIsactive(false);
	}
	
	public void activatePlayer()
	{
		setIsactive(true);
	}
	


}
