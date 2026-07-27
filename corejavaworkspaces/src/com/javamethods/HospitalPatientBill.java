package com.javamethods;
import java.util.Scanner;
public class HospitalPatientBill {
	String patientName;
	int age;
	double roomChargePerDay;
	int day;
	
	public HospitalPatientBill(String patientName, int age, double roomChargePerDay, int day) {
		this.patientName = patientName;
		this.age = age;
		this.roomChargePerDay = roomChargePerDay;
		this.day = day;
	}
	
	void show() {
		System.out.println("Pateint Name : "+patientName);
		System.out.println("Age of the Patient : "+age);
		System.out.println("Room Charge Per Day : "+roomChargePerDay);
		System.out.println("Days Admitted : "+day);
		double hsptlBill = roomChargePerDay*day;
		System.out.println("Total Hospital Bill : "+hsptlBill);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Pateint Name : ");
		String name= sc.nextLine();
		System.out.println("Enter the Age of the Patient : ");
		int age = sc.nextInt();
		System.out.println("Enter Room Charge Per Day : ");
		double roomChargePerDay = sc.nextDouble();
		System.out.println("Enter Number of Days Admitted : ");
		int day = sc.nextInt();
		HospitalPatientBill h1= new HospitalPatientBill(name,age,roomChargePerDay,day);
		h1.show();
		sc.close();
	}

}
