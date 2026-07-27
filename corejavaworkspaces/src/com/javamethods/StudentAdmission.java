package com.javamethods;
import java.util.Scanner;
public class StudentAdmission {
		int id;
		String name;
		String course;

		public StudentAdmission() {
			this(0);
		}
		StudentAdmission(int id){
			this(id,"Unknown");
		}
		StudentAdmission(int id,String name){
			this(id,name,"No Course");
		}

	public StudentAdmission(int id, String name, String course) {
	this.id = id;
	this.name = name;
	this.course = course;
}
	void show() {
		System.out.println("The Student ID : "+id);
		System.out.println("The Name of the Student : "+name);
		System.out.println("The Course is : "+course);
	}

	public static void main(String[] args) {
		StudentAdmission s = new StudentAdmission(101,"Bhanu","Java");
		s.show();
		
	}

}
