package com.javamethods;
import java.util.Scanner;

public class MethodsExperiment {
	int addMethod(int a,int b) {
		int c = a+b;
		multiMethod(c, 20);
		return c;
	}
	void multiMethod(int c,int d) {
		int m=c*d;
		System.out.println("Multiplication will be :"+m);
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b= sc.nextInt();
		int c = addMethod(a,b);
		System.out.println("The addition result is :"+c);
		sc.close();
		}

}
