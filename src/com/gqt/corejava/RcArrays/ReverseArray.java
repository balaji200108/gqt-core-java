package com.gqt.corejava.RcArrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		System.out.println("Original Array is: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nAfter reversing array elements are: ");
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
	}

}
