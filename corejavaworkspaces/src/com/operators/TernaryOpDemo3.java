package com.operators;
import java.util.Scanner;
public class TernaryOpDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Number 2 : ");
		int n2 = sc.nextInt();
		System.out.println("Enter the Operator : ");
		char op = sc.next().charAt(0);
		int res = (op=='+')? n1+n2 : (op=='-')? n1-n2 : (op=='*')? n1*n2 : (op=='%')? n1%n2 : (op=='/')? n1/n2 : n1;
		System.out.println("Result : "+res);
		sc.close();
	}

}
