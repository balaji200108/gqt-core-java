package com.gqt.corejava.arrays;
import java.util.Scanner;
public class Array1DUnStructured {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the student count: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.print("Enter the marks of student no: "+(i+1));
		arr[i]=sc.nextInt();
	}
	System.out.println("    ");
	for(int i=0;i<arr.length;i++) {
		System.out.print("The marks of student no:  "+(i+1)+" is= "+arr[i]);
	
	}
	}

}
