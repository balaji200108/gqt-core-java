package com.gqt.corejava.RcArrays;
import java.util.Scanner;
public class FindIndexOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr1[]= {1,9,24,2,56,89};
		System.out.print("Enter the element to find the index: ");
		int n=sc.nextInt();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==n) {
				System.out.println("The index of given element is: "+i);
			}
		}
	}

}
