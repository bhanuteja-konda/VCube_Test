package com.javamethods;
import java.util.Scanner;
public class BankSBIDetails {
	
	static String bankName="State Bank Of India";
	static String ifscCode = "SBIN0000123Y";
	String accHolderName;
	long accNum = 10012009L ;
	double accBalance;
	{
		accNum++;
	}
	void show() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("IFSC Code : "+ifscCode);
		System.out.println("Account Holder Name : "+accHolderName);
		System.out.println("Account Balance : "+accBalance);
		System.out.println("Account Number : "+accNum);
	}
	BankSBIDetails(){}

	public BankSBIDetails(String accHolderName, long accBalance) {
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name : ");
		String holderName = sc.nextLine();
		System.out.println("Enter the Account Balance : ");
		long balance = sc.nextLong();
		BankSBIDetails b1= new BankSBIDetails(holderName,balance);
		b1.show();
		sc.close();
	}


}
