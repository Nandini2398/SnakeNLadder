package com.bridgelabz.snakeNladder;

public class snakeNladder {
	public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
		 public static void main(String[] args){
		      int position = 0, condition1 = 0, condition2 = 0, condition3 = 0, condition4 = 0;
		      System.out.println("Starting position of player is: " + START);
		      while(position < 100){
		      int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			  condition1++;
		      System.out.println("Number on rolled dice is : " +roll);
		      int condition = (int) (Math.floor(Math.random() * 10) % 3);
		      System.out.println("Condition: " +condition);
		      switch (condition){
		            case NO_PLAY:
		                  System.out.println("New Position is: " + position);
		                  condition4++;
		                  break;
		            case LADDER:
		                  position = position + roll;
		                  if(position <= 100)
		                  System.out.println("New Position is: " + position);
		                  else{
		                  position = position - roll;
		                  System.out.println("Remains at same position: " + position);
								}
		                  condition2++;
		                  break;
		            case SNAKE:
		                  position = position - roll;
		                  if (position <= 100){
		                  if (position >= 0 ){
		                  System.out.println("New Position is: " + position);
								}
		                  else{
		                  position = 0;
		                  System.out.println("New Position is: " + position);
		                  }
								}
		                  else{
		                  System.out.println("New position is:" + position);
								}
						  condition3++;
		                  break;
		            default:
		                  System.out.println("Default");
		                  break;
		         }
		      }
		      			  System.out.println();
				          System.out.println("Player ROLLED DICE "+condition1+" time and got SNAKE "+condition3+" times and got LADDER "+condition2+" times and got NO PLAY "+condition4+" times to win the game");
				          if (position == 100)
				          System.out.println("***");
		                  System.out.println("    PLAYER WON");
		                  System.out.println("***");
		      }
}
