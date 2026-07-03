package com.vcubejava;

public class CricketPlayer {
	
	static String TeamName = "TEAM INDIA";
	int runs;
	String PName;

	public static void main(String[] args) {
		System.out.println("WELCOME TO TEAM INDIA !!!! ");
		CricketPlayer p1= new CricketPlayer();
		p1.runs = 45;
		p1.PName = "Rohit Sharma";
		CricketPlayer p2= new CricketPlayer();
		p2.runs=18;
		p2.PName="Virat Kohli";
		System.out.println("Runs of Player 1 : "+ p1.runs);
		System.out.println("Name of the Player : "+p1.PName);
		System.out.println("Player 1 belongs to "+ TeamName);
		System.out.println("Runs of Player 2 : "+ p2.runs);
		System.out.println("Name of the Player 2 : "+p2.PName);
		System.out.println("Player 2 belongs to "+ TeamName);

	}

}
