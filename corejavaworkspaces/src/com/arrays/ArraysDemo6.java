package com.arrays;
import java.util.*;
//Count Even
public class ArraysDemo6 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements into the Array : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println("The total numb er of evens present in the array will be : "+count);
		sc.close();

	}

}
