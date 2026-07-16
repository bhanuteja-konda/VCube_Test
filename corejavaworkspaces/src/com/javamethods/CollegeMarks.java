package com.javamethods;
import java.util.Scanner;
public class CollegeMarks {
	double getSemester1Percentage(int s1,int s2,int s3,int s4, int s5 , int s6){
		double res1=((s1+s2+s3+s4+s5+s6)/6);
		return res1;
	}
	double cGPA(double gpa1,double gpa2,double gpa3,double gpa4,double gpa5,double gpa6,double gpa7,double gpa8) {
		double cgpa=(gpa1+gpa2+gpa3+gpa4+gpa5+gpa6+gpa7+gpa8)/8;
		return cgpa;
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of subject 1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter the marks of subject 2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter the marks of subject 3 : ");
		int m3 = sc.nextInt();
		System.out.println("Enter the marks of subject 4 : ");
		int m4 = sc.nextInt();
		System.out.println("Enter the marks of subject 5 : ");
		int m5 = sc.nextInt();
		System.out.println("Enter the marks of subject 6 : ");
		int m6 = sc.nextInt();
		double res = getSemester1Percentage(m1,m2,m3,m4,m5,m6);
		System.out.println("The toal of the marks will be : "+res);
		System.out.println("Enter the GPA of Semester 1 : ");
		double s1 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 2 : ");
		double s2 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 3 : ");
		double s3 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 4 : ");
		double s4 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 5 : ");
		double s5 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 6 : ");
		double s6 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 7 : ");
		double s7 = sc.nextDouble();
		System.out.println("Enter the GPA of Semester 8 : ");
		double s8 = sc.nextDouble();
		double f = cGPA(s1,s2,s3,s4,s5,s6,s7,s8);
		System.out.println("CGPA will be  : "+f);
		
	}
	

}
