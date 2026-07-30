package com.operators;
import java.util.Scanner;
public class TernaryOpDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Character : ");
		char ch = sc.next().charAt(0);
		ch= Character.toUpperCase(ch);
		String ch1= (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')? "Vowel" : "Not vowel";
		System.out.println(ch1);
		sc.close();
	}

}
