package com.javamethods;

public class TernaryOpDemo1 {

	public static void main(String[] args) {
		int a=-50;
		String pn = (a > 0) ? "Positive" : "Negative";
		System.out.println("The number is : "+pn);
		int marks = 64;
		char grade = (marks>=90)? 'A' : (marks>=75 && marks<90)? 'B':(marks >=60 && marks<75)? 'C' : (marks >=40 && marks<60)? 'D' : 'F';
		System.out.println("The Grade will be : "+ grade);
	}

}
