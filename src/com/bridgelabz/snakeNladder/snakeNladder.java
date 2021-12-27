package com.bridgelabz.snakeNladder;

public class snakeNladder {

	 public static final int NO_PLAY = 0;
	 public static final int LADDER = 1;
	 public static final int SNAKE = 2;
	 public static final int START = 0;
	 public static void main(String[] args){
	      int positionPlayer1 = 0, positionPlayer2 = 0, cntForBets = 0, cntForLadder = 0, cntForSnake = 0, cntForNoPlay = 0, cntForBets2 = 0, cntForLadder2 = 0, cntForSnake2 = 0, cntForNoPlay2 = 0;
	      System.out.println("Starting position of player is: " + START);
	      while(positionPlayer1 < 100 && positionPlayer2 < 100){
	      int conition1 = 1;
	1:	  while(condition1 == 1){
		  System.out.println("PLAYER 1");
	      int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		  countForBets++;
	     		 System.out.println("Number on rolled dice is : " +roll);
	     		 conition1 = (int) (Math.floor(Math.random() * 10) % 3);
	      		 System.out.println("Condition: " +condition1);
	     		 switch (condition1){
	           	 case NO_PLAY:
				 System.out.println("NO PLAY");
	             System.out.println("New Position is: " + positionPlayer1);
				 countForNoPlay++;
	             break;
	         case LADDER:
				 System.out.println("Got LADDER");
				 positionPlayer1 = positionPlayer1 + roll;
				 if(positionPlayer1 <= 100)
				 System.out.println("New Position is: " + positionPlayer1);
				 else{
				 positionPlayer1 = positionPlayer1 - roll;
				 System.out.println("Remains at same position: " + positionPlayer1);
		}
				 countForLadder++;
				 continue a;
			 case SNAKE:
				  System.out.println("Got SNAKE");
				  positionPlayer1 = positionPlayer1 - roll;
				  if (positionPlayer1 >= 0 ){
				  System.out.println("New Position is: " + positionPlayer1);
				  }
				  else{
				  positionPlayer1 = 0;
				  System.out.println("New Position is: " + positionPlayer1);
				  }
			      countForSnake++;
				  break;
	              default:
	              System.out.println("Default");
	              break;
	         }
			}
			      int condition2 = 1;
	2:		      while(condition2 == 1 && positionPlayer2 < 100){
			      System.out.println("PLAYER 2");
			      int roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			      countForBets2++;
		          System.out.println("Number on rolled dice is : " +roll1);
		          condition2 = (int) (Math.floor(Math.random() * 10) % 3);
		          System.out.println("Condition: " +condition2);
		          switch (condition2){
	           case NO_PLAY:
				  System.out.println("NO PLAY");
	              System.out.println("New Position is: " + position2);
	              countForNoPlay2++;
	              break;
	           case LADDER:
				  System.out.println("Got LADDER");
				  position2 = position2 + roll1;
				  if(position2 <= 100)
				  System.out.println("New Position is: " + position2);
				  else{
				  position2 = position2 - roll1;
				  System.out.println("Remains at same position: " + position2);
			}
				  countForLadder2++;
				  continue 2;
	           case SNAKE:
				  System.out.println("Got SNAKE");
				  position2 = position2 - roll1;
				  if (position2 >= 0 ){
				  System.out.println("New Position is: " + position2);
			}
				  else{
				  position2 = 0;
				  System.out.println("New Position is: " + position2);
			}
				  countForSnake2++;
				  break;
				  default:
				  System.out.println("Default");
				  break;
	       	  			}
				}
			}
	      System.out.println();
	      System.out.println("------");
	      if (position1 == 100){
	      System.out.println("Player1 ROLLED DICE "+ countForBets +" time and got SNAKE "+ countForSnake +" times and got LADDER "+ countForLadder +" times and got NO PLAY "+ countForNoPlay +" times to win the game");
	      System.out.println("    PLAYER1 WON");
	      }
	      else{
	      System.out.println("Player2 ROLLED DICE "+ countForBets2 +" time and got SNAKE "+ countForSnake2 +" times and got LADDER "+ countForLadder2 +" times and got NO PLAY "+countForNoPlay2+" times to win the game");
	      System.out.println("    PLAYER2 WON");
	      }
	      System.out.println("------");
	      }
}
