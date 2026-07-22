package com.javamethods;
import java.util.Scanner;
public class CricketPlayerStatistics {
	String pName;
	int matchesPlayed;
	int totalRuns;
	CricketPlayerStatistics(){};
	CricketPlayerStatistics(String name,int matches,int runs) {
		pName= name;
		matchesPlayed =matches;
		totalRuns = runs;
	}
	void show() {
		System.out.println("Player Name : "+pName);
		System.out.println("Matches Played : "+matchesPlayed);
		System.out.println("Total runs : "+totalRuns);
		double avg=totalRuns/matchesPlayed;
		System.out.println("Average Runs : "+avg);
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Player Name : ");
		String name= sc.nextLine();
		System.out.print("Enter the Matches Played : ");
		int matches= sc.nextInt();
		System.out.print("Enter the total runs scored : ");
		int totruns = sc.nextInt();
		CricketPlayerStatistics c1 = new CricketPlayerStatistics(name,matches,totruns);
		c1.show();
		sc.close();
	}

}
