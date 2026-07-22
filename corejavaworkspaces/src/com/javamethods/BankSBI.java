package com.javamethods;
import java.util.Scanner;
public class BankSBI {
	long accNum = 10012009L;
	String bankName;
	String ifscCode;
	String accName;
	double bal;
	{
		accNum++;
	}
	
	BankSBI(){
		
	}
	public BankSBI(long accNum, String bankName, String ifscCode, String accName, double bal) {
		this.accNum = accNum;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accName = accName;
		this.bal = bal;
	}
	void bankInfo(String bankName,String ifscCode,String accName,double bal) {
		System.out.println("Name of the Bank : "+bankName);
		System.out.println("IFSC Code : "+ifscCode);
		System.out.println("Name of the Holder : "+accName);
		System.out.println("Bank Balance : "+bal);
		
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bank Name : ");
		String bankName = sc.nextLine();
		System.out.println("Enter the IFSC Code : ");
		String ifscCode= sc.next();
		
		System.out.println("Account Holder Name : ");
		
		String accName= sc.nextLine();
		sc.next();
		System.out.println("Account Balance : ");
		double bal = sc.nextInt();
		BankSBI b1= new BankSBI();
		b1.bankInfo(bankName,ifscCode,accName,bal);
		System.out.println("The Account number Will be : "+accNum);
		sc.close();
	
	
	}

}
