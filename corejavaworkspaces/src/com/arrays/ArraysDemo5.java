package com.arrays;
import java.util.*;

// Finding the Average of the Elements in the array
public class ArraysDemo5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n = sc.nextInt();
		System.out.println("Enter the Elements in to the Array : ");
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum+nums[i];
		}
		int avg = sum/n;
		System.out.println("The Average of the elements in the array will be : "+avg);
		sc.close();
		}

}
