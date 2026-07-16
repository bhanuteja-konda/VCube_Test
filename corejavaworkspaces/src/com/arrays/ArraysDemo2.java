package com.arrays;

public class ArraysDemo2 {
	void retArray(int nums[]) {
		for(int x:nums) {
			System.out.print(x+" ");
		}
	}
	
	
	void main(String[] args) {
		int arr[] = {1,2,2,3,5};
		arr[2]=5;
		retArray(arr);
		int i=0;
		System.out.println(" ");

		System.out.println("********************");
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}


	}

}
