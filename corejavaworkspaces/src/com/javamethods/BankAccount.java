package com.javamethods;

public class BankAccount {


	void displayAccount() {
		int accnum= 1234;
		String accName = "Konda Bhanu Teja";
		String accType = "Savings";
		double bal = 6541.26;
		System.out.println("Account number is : "+accnum);
		System.out.println("Account holder name is :"+accName);
		System.out.println("Account Type is : "+ accType);
		System.out.println("Account Balance is :"+ bal);
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.displayAccount();

	}

}
