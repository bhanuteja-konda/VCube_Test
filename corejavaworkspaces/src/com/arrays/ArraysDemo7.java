package com.arrays;
import java.util.*;
public class ArraysDemo7 {
//Reversing the Array
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		Scanner sc  = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the size of the Array : ");
		int a= sc.nextInt();
		int nums[] = new int[a];
		for(int i=0;i<a;i++) {
			nums[i]= sc.nextInt();
		}
		for(int i=a-1;i>=0;i--) {
			System.out.print(nums[i] +" ");
		}
	}

}
