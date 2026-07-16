package com.javamethods;
import java.util.Scanner;
public class StudentResult {
	void displayStudent(String name) {
		System.out.println("Name of the Student : "+ name);
	}
	void calculateTotal(int m1,int m2,int m3) {
		System.out.println("The total marks will be : "+(m1+m2+m3));
	}
	void calculateAverage(int m1,int m2,int m3) {
		System.out.println("The Average of the marks will be : "+((m1+m2+m3)/3));
	}
	void main() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name of the Student : ");
		String s = sc.nextLine();
		System.out.println("Enter marks 1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter marks 2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter marks 3 : ");
		int m3 = sc.nextInt();
		displayStudent(s);
		calculateTotal(m1,m2,m3);
		calculateAverage(m1,m2,m3);
		sc.close();
	}

}
