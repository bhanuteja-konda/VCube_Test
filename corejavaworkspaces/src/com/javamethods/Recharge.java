package com.javamethods;

public class Recharge {
	String planName="Unlimited 299";
	int validity = 28;
	float data= 2.5f;
	String calls = "Unlimited";
	void showPlanDetails() {
		System.out.println("Current Recharge plan ");
		System.out.println("Plan Name : "+ planName);
		System.out.println("Validity : "+ validity + " days");
		System.out.println("Data : "+ data +" GB/Day");
		System.out.println("Calls : "+calls);
		
	}
	void recharge(double amount) {
		System.out.println("Recahrge Successful!");
		System.out.println("Recharge Amount : "+amount);
	}
	void main(String[] args) {
		showPlanDetails();
		recharge(399.0);
	}

}
