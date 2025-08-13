package com.gqt.corejava.RcArrays;
import java.util.Scanner;
public class ArrayCopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[arr1.length];
		System.out.println("Elements of the array1 are: ");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Copying one array to another.......");
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("After copying elemnts in second array are:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}

}
