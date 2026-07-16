package com.javamethods;
import java.util.Scanner;
public class Bank1 {
	double calculateIntrest(double principal,double rate,int time) {
		double res=((principal*rate*time)/100);
		return res;
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount :");
		double p = sc.nextDouble();
		System.out.println("Enter the Rate  :");
		double r = sc.nextDouble();
		System.out.println("Enter the Time  :");
		int t = sc.nextInt();
		double k= calculateIntrest(p,r,t);
		System.out.println("The Simple Interest will be : "+k);
		sc.close();
	}

}
