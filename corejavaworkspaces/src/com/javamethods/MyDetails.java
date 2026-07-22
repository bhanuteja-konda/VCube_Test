package com.javamethods;
import java.util.Scanner;
public class MyDetails {
	void getFirstName(String fname) {
		System.out.println("First name : "+ fname);
	}
	void getLastName(String lname) {
		System.out.println("Last name : "+ lname);
	}
	void getFullName(String fname,String lname) {
		System.out.println("Full name : "+ fname +" "+lname);
	}
	void getAge(int age) {
		System.out.println(" Age : "+ age);
	}
	void getGender(char gender) {
		System.out.println("Gender : "+gender);
	}
	String getColName(String cname) {
		System.out.println("College Name : ");
		return cname;
	}
	float getCGPA(float res) {
		System.out.println("CGPA : ");
		return res;
	}
	void getSchoolName(String sname ) {
		System.out.println("School Name : "+sname);
	}
	void getInterName() {
		System.out.println("Inter College Name : Sri Bhavishya Junior College ");
	}
	Double getInterMarks(double imarks) {
		System.out.println("Intermediate Marks : ");
		return imarks;
	}
	void main() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the First Name : ");
		String fname=sc.next();
		System.out.println("Enter the Last Name : ");
		sc.nextLine();
		System.out.println("Enter the Full Name : ");
		String lname = sc.nextLine();
		System.out.println("Enter the Age : ");	
		int age= sc.nextInt();
		System.out.println("Enter the Gender : ");	
		char ch = sc.next().charAt(0);
		System.out.println("Enter the College Name : ");	
		String cname=sc.nextLine();
		System.out.println("Enter the Results  : ");	
		float res=sc.nextFloat();
		System.out.println("Enter the School Name : ");	
		String sname=sc.nextLine();
		System.out.println("Enter the Marks : ");	
		double imarks = sc.nextDouble();
		getFirstName(fname);
		getLastName(lname);
		getFullName(fname,lname);
		getAge(age);
		getGender(ch);
		getColName(cname);
		getCGPA(res);
		
		sc.close();
		
	}

}
