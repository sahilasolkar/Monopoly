package game.components;

public class Player {
	
	char name;
	static int position;
	static int prevpos;
	int balance=1500;
	
	

	public Player(char name) {
		super();
		this.name = name;
	}


	public char getName() {
		return name;
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
	
	public void updatePos(int addon)
	{
		int temp;
		
		prevpos = position;
		
		position = position + addon;
		
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
	
	

}
