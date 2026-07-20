package com.javamethods;
import java.util.Scanner;
public class Calculator {
	double add(double a, double b) {
		return a+b;
	}
	double subtract(double a, double b) {
		return a-b;
	}
	double multiply(double a , double b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}
	void main() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		double n1= sc.nextDouble();
		System.out.println("Enter the number 2 :");
		double n2 = sc.nextDouble();
		double a =add(n1,n2);
		System.out.println("Addition result : "+a);
		double s = subtract(n1,n2);
		System.out.println("Subtraction Result : "+s);
		double m = multiply(n1,n2);
		System.out.println("Multiplication Result : "+m);
		double d =divide(n1,n2);
		System.out.println("Division Result : "+d);
		sc.close();
	}

}
