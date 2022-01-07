package game.components;

import java.util.Scanner;

public class Bank {
	String name;
	int balance;
	int salary = 1500;
	int passingsallary=200;
	int dividend = 50;
	int incometax = 200;
	int luxurytax = 100;
	int holidayfund = 100;
	
	public Bank(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public void paySalary(Player p)
	{
		this.balance = this.balance-this.passingsallary;
		p.balance = p.balance + this.passingsallary; 
	}
	
	public int getBalance()
	{
		//System.out.println("balance = "+balance);
		return balance;
	}
	
	public void payDividend(Player p)
	{
		this.balance = this.balance-dividend;
		p.balance = p.balance + dividend;
		System.out.println(this.name+" payed player - "+p.getName()+" a dividend of - "+this.dividend+" Rs");
	}
	
	public void incomeTax(Player p)
	{
		p.balance = p.balance-incometax;
		if(p.balance<0)
		{
			p.eliminatePlayer();
		}
		this.balance = this.balance+incometax;
		System.out.println("An Income Tax of "+incometax+" was charged to the player "+p.getName());
	}
	
	public void luxuryTax(Player p)
	{
		p.balance = p.balance-luxurytax;
		if(p.balance<0)
		{
			p.eliminatePlayer();
		}
		this.balance = this.balance+luxurytax;
		System.out.println("A Luxury Tax of "+this.luxurytax+" was charged to the player "+p.getName());
	}
	
	public void fine(Player p, int fine)
	{
		p.balance = p.balance-fine;
		if(p.balance<0)
		{
			p.eliminatePlayer();
		}
		this.balance = this.balance+fine;
		System.out.println("A fine of "+fine+" was charged to the player "+p.getName());
	}
	
	public void paymoney(Player p, int amount)
	{
		this.balance = this.balance-amount;
		p.balance = p.balance+amount;
		System.out.println(this.name+" payed player - "+p.getName()+" an amount of - "+amount+" Rs");
	}
	
	public void incometaxrefund(Player p, int amt)
	{
		this.balance = this.balance-amt;
		p.credit(amt);
	}
	
	public void holidayfund(Player p)
	{
		this.balance = this.balance-this.holidayfund;
		p.credit(this.holidayfund);
	}
	
	public void lifeInsuranceMaturityPay(Player p, int amt)
	{
		this.balance = this.balance - amt;
		p.credit(amt);
	}
	
	public void dealproperty(Player player, PropertyCell property)
	{
		int bal = player.balance;
		bal = bal - property.price;
		
		Scanner ask = new Scanner(System.in);
		String i;
		System.out.println("-------------------------");
		System.out.println("\n"+ property.fname+ " " + property.lname+ "\n"+ "PRICE - "+property.price+"\n"+"RENT - "+ property.rent + "\n");
		System.out.println("-------------------------");
		if(!property.istaken)
		{
			System.out.println("--------------------------------");
			System.out.println("\ndo you want to buy the property?\n");
			System.out.println("press y for yes and n for no\n");
			System.out.println("--------------------------------");
			i = ask.next();
			switch(i)
			{
			case "y":
				if(bal>0)
				{
					player.debit(property.price);
					player.propertylist.add(property);
					System.out.println(property.fname+ " "+ property.lname+ " added to the propertyList of player "+player.name);
				}
				else
				{
					System.out.println("insufficient balance!");
				}
				property.updateOwnership(player);
				break;
			case "n":
				System.out.println("Player "+player.name+ " chose not to buy the property - "+property.getFname());
				break;
			default: 
				System.out.println("enter the correct input");
				break;
			}
		}
	}
}
