package com.arrays;
//Second Largest Element in the Array
import java.util.*;

public class ArraysDemo8 {

	public static void main(String[] args) {
//		int nums[] = {1,2,3,4,5};
//		int arr[] = {1,2,3,4,5};
//		boolean ans= Arrays.equals(nums,arr);
//		System.out.println(ans);
//		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Values into the Array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Second Highest Element in the Array : ");
		System.out.println(arr[n-2]);
		sc.close();
		
	}

}
