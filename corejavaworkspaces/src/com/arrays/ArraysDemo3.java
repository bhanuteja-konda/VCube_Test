package com.arrays;

import java.util.Arrays;

public class ArraysDemo3 {
	
	int[] returningArray() {
		int num[]= {1,2,2,3,4};
		return num;
	}
	
	void main(String[] args) {
		int[] k = returningArray();
		System.out.println(Arrays.toString(k));

	}

}
