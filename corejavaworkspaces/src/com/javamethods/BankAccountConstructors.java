package com.javamethods;

public class BankAccountConstructors {
	String accountHolder;
	long accountNumber;
	double balance;
	
	public BankAccountConstructors() {
		this("Unknown");
	}

	public BankAccountConstructors(String accountHolder, long accountNumber) {
		this(accountHolder,accountNumber,0.0);
	}

	public BankAccountConstructors(String accountHolder) {
		this(accountHolder,0);
	}

	public BankAccountConstructors(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void display() {
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Balance : "+balance);
	}
	void main() {
		
		BankAccountConstructors b1 = new BankAccountConstructors();
		BankAccountConstructors b2 = new BankAccountConstructors("Krishna");
		BankAccountConstructors b3 = new BankAccountConstructors("Krishna",1234567890L);
		BankAccountConstructors b4 = new BankAccountConstructors("Krishna",1234567890L,50000.00);
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		
		
	}

}
