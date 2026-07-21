package com.javamethods;
import java.util.Scanner;
public class SalarySlipGenerator {
	void salarySlip(String eName,double basicSalary) {
		System.out.println("Employee Name : "+eName);
		double hra= 0.2*basicSalary;
		double da= 0.1*basicSalary;
		double grossSalary = basicSalary+hra+da;
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("HRA (20%) : "+ hra);
		System.out.println("DA (10%) : "+da);
		System.out.println("Gross Salary : "+grossSalary);
		
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		String name= sc.next();
		System.out.print("Enter Basic Salary : ");
		double salary = sc.nextDouble();
		salarySlip(name,salary);
		sc.close();
	}

}
