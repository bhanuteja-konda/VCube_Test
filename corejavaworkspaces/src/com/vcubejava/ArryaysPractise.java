package com.vcubejava;
import java.util.Scanner;
public class ArryaysPractise {
	int add(int num1, int num2) {
		
		return num1+num2;
	}
	void main() {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int bhanu= add(a,b);
		System.out.println(bhanu);
		sc.close();
	}

}
