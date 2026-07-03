package com.vcubejava;

public class Instances {
	int sid;
	String sname;
	String address;
	int age;
	public static void main(String[] args) {
		System.out.println("Method started !");
		Instances st1 = new Instances();
		
		System.out.println("Student 1 info");
		
		st1.sname= "KONDA BHANU TEJA";
		st1.sid=7927;
		st1.address = "KPHB COLONY";
		st1.age= 21;
		System.out.println("Student name : "+ st1.sname);
		System.out.println("Student ID : "+ st1.sid);
		System.out.println("Student Address : "+ st1.address);
		System.out.println("Student Age : "+ st1.age);
		
		
		System.out.println("Student 2 info");

		
		Instances st2 = new Instances();
		st2.sname= "KONDA ARUNA DEVI";
		st2.sid=1234;
		st2.address = "CHENNAI";
		st2.age= 23;
		System.out.println("Student name : "+ st2.sname);
		System.out.println("Student ID : "+ st2.sid);
		System.out.println("Student Address : "+ st2.address);
		System.out.println("Student Age : "+ st2.age);
		
		
	}
}
