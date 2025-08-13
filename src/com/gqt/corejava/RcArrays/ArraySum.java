package com.gqt.corejava.RcArrays;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n= sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("\nSum of array elemnts is: "+sum);
		sc.close();
	}

}
