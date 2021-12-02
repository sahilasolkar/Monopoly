package game.components;

import java.util.ArrayList;

public class Board {
	
	
	StringBuilder r1 = new StringBuilder(" f   p    "+"        |   220   "+"|         "+"|   220   "+ "|   240   "+ "|   200   "+ "|  260    "+ "|   260   "+"|   150   "+ "|  280    "+"|  g      ");
	StringBuilder r2 = new StringBuilder("  r   a   "+"        |  kentuck"+"| chance  "+"| indiana "+ "| illinois"+ "| railroad"+ "| atlantic"+ "| ventnor "+"|  water  "+ "| marvin  "+"|  o      ");
	StringBuilder r3 = new StringBuilder("   e   r  "+"        |  avenue "+"|         "+"|  avenue "+ "|  avenue "+ "|  b & o  "+ "|  avenue "+ "|  avenue "+"|  works  "+ "| avenue  "+"|     t   ");
	StringBuilder r4 = new StringBuilder("    e   k         |_________|_________|_________|_________|_________|_________|_________|_________|_________|     o   j           ");
	StringBuilder r5 = new StringBuilder("         i        |         |         |         |         |         |         |         |         |         |         a           ");
	StringBuilder r6 = new StringBuilder("          n       |         |         |         |         |         |         |         |         |         |         i           ");
	StringBuilder r7 = new StringBuilder("___________g _____|_________|_________|_________|_________|_________|_________|_________|_________|_________|_________l________");
	StringBuilder r8 = new StringBuilder("newyork     |     |                                                                                         |     | pacific    ");
	StringBuilder r9 = new StringBuilder("avenue  200 |     |                                                                                         |     | avenue 300 ");
	StringBuilder r10= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r11= new StringBuilder("tennese     |     |                                                                                         |     | north  300 ");
	StringBuilder r12= new StringBuilder("avenue  180 |     |                                                                                         |     | california ");
	StringBuilder r13= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r14= new StringBuilder("community   |     |                                                                                         |     | community  ");
	StringBuilder r15= new StringBuilder("chest       |     |                                                                                         |     | chest      ");
	StringBuilder r16= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r17= new StringBuilder("st. james   |     |                                                                                         |     |pennsylvania");
	StringBuilder r18= new StringBuilder("place  180  |     |                                                                                         |     | avenue 320 ");
	StringBuilder r19= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r20= new StringBuilder("pennsylvania|     |                                                                                         |     | short      ");
	StringBuilder r21= new StringBuilder("railroad 200|     |                                                                                         |     | line   200 ");
	StringBuilder r22= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r23= new StringBuilder("virginia    |     |                                                                                         |     | chance     ");
	StringBuilder r24= new StringBuilder("avenue  160 |     |                                                                                         |     |            ");
	StringBuilder r25= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r26= new StringBuilder("states      |     |                                                                                         |     | park       ");
	StringBuilder r27= new StringBuilder("avenue  140 |     |                                                                                         |     | place  350 ");
	StringBuilder r28= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r29= new StringBuilder("electric    |     |                                                                                         |     | luxury     ");
	StringBuilder r30= new StringBuilder("company 150 |     |                                                                                         |     | tax    100 ");
	StringBuilder r31= new StringBuilder("------------|-----|                                                                                         |-----|------------");
	StringBuilder r32= new StringBuilder("st.charles  |     |                                                                                         |     | boardwalk  ");
	StringBuilder r33= new StringBuilder("place  140  |     |                                                                                         |     |        400 ");
	StringBuilder r34= new StringBuilder("------------+-----+---------+---------+---------+---------+---------+---------+---------+---------+---------+-----+------------");
	StringBuilder r35= new StringBuilder("                  |         |         |         |         |         |         |         |         |         |    collect          ");
	StringBuilder r36= new StringBuilder(" i  j             |         |         |         |         |         |         |         |         |         |        your         ");
	StringBuilder r37= new StringBuilder("  n  a            |_________|_________|_________|_________|_________|_________|_________|_________|_________|          sallary    ");
	StringBuilder r38= new StringBuilder("      i   "+"        |connecti-"+"| vermount"+"|  chance "+ "| oriental"+ "| reading "+ "| income  "+ "| baltic  "+"|community"+ "|mediter- "+"|         ");
	StringBuilder r39= new StringBuilder("       l  "+"        |cut avenu"+"|  avenue "+"|         "+ "|  avenue "+ "| railroad"+ "|  tax    "+ "| avenue  "+"|  chest  "+ "|ranean   "+"|    200  ");
	StringBuilder r40= new StringBuilder(" visiting "+"        |   120   "+"|    100  "+"|         "+ "|   100   "+ "|   200   "+ "|  200    "+ "|   60    "+"|         "+ "|  60     "+"|         ");
	StringBuilder r41= new StringBuilder("                                                                                                                                                         ");
	
	
	StringBuilder[] board=new StringBuilder[] {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,r31,r32,r33,r34,r35,r36,r37,r38,r39,r40,r41};
	
	
	
	public void displayboard()
	{
		for (int i=0;i<board.length;i++)
		{
			System.out.println(board[i]+"");
		}
	}
	
	public void update(int x, char c)
	{
		//use switch statements to switch (x) and accordingly adjust the placement of the player on the specific square using setCharAt(index , char) fn
		 
				switch (x)
				{
				case 0:
					
					r36.setCharAt(112, c);
					
					break;
				
                case 1:
					
					r36.setCharAt(104, c);
					
					break;
                case 2:
					
					r36.setCharAt(94, c);
					
					break;
                case 3:
					
					r36.setCharAt(84, c);
					
					break;
                case 4:
					
					r36.setCharAt(74, c);
					
					break;
                case 5:
					
					r36.setCharAt(64, c);
					
					break;
                case 6:
					
					r36.setCharAt(54, c);
					
					break;
                case 7:
					
					r36.setCharAt(44, c);
					
					break;
                case 8:
					
					r36.setCharAt(34, c);
					
					break;
                case 9:
					
					r36.setCharAt(24, c);
					
					break;
                case 10:
					
					r36.setCharAt(14, c);
					
					break;
					
				}
	}
	
	public void clear(int x)
	{
		//use switch statements to switch (x) and accordingly adjust the placement of the player on the specific square using setCharAt(index , char) fn
		 
				switch (x)
				{
				case 0:
					
					r36.setCharAt(112, ' ');
					
					break;
				
                case 1:
					
					r36.setCharAt(104, ' ');
					
					break;
                case 2:
					
					r36.setCharAt(94, ' ');
					
					break;
                case 3:
					
					r36.setCharAt(84, ' ');
					
					break;
                case 4:
					
					r36.setCharAt(74, ' ');
					
					break;
                case 5:
					
					r36.setCharAt(64, ' ');
					
					break;
                case 6:
					
					r36.setCharAt(54, ' ');
					
					break;
                case 7:
					
					r36.setCharAt(44, ' ');
					
					break;
                case 8:
					
					r36.setCharAt(34, ' ');
					
					break;
                case 9:
					
					r36.setCharAt(24, ' ');
					
					break;
                case 10:
					
					r36.setCharAt(14, ' ');
					
					break;
					
				}
	}

}