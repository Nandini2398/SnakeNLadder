package com.bridgelabz.snakeNladder;

public class snakeNladder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;


	public static void main(String[] args){
		int position = 0;
		System.out.println("Starting position of player is: " + START);
		int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Number on rolled dice is : " +roll);
		int condition = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Condition: " +condition);
		switch (condition){
				case NO_PLAY:
						System.out.println("New Position is: " + position);
						break;
				case LADDER:
						position = position + roll;
						System.out.println("New Position is: " + position);
						break;
				case SNAKE:
						position = position - roll;
						if ( position >= 0)
						System.out.println("New Position is: " + position);
						else
						position = 0;
						System.out.println("New Position is: " + position);
						break;
				default:
						System.out.println("Default");
						break;
			}
		}
}