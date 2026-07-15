package com.javamethods;

public class Fact {
	void factorial(int num) {
		int pr=1;
		if(num==0) {
			System.out.println(1);
		}else {
			for(int i=1;i<=num;i++) {
				pr = pr*i;
				System.out.println(pr);
			}
		}
		
	}
	void main(String[] args) {
		factorial(0);

	}

}
