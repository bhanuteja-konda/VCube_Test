package com.javamethods;

public class SwapNumbers {
	
	 void main() {
		int a =10;
		int b=20;
		System.out.println("Before Swapping : ");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
//		a= a+b;
//		b = a-b;
//		a=a-b;
		a= a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping : ");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		
	}

}
