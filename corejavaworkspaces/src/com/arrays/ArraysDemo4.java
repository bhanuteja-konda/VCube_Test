package com.arrays;
import java.util.*;
public class ArraysDemo4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		System.out.println("Enter the Values in the Array : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Printing the array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Finding the Maximum value in the array
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		
		System.out.println("The Maximum value in the Array is : "+max);
		
		//Finding the Minimum Element in the Array
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The Minimum Element in the Array is : "+min);
		
		
		
		//Finding the Sum of the elements in the Array
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum+arr[i];
		}
		
		System.out.println("The sum of the Elements in the Array will be : "+sum);
		
		
		sc.close();

	}

}
