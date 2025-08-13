package com.gqt.corejava.RcArrays;
import java.util.Scanner;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr1[]= {1,2,4,9,10};
		System.out.print("Enter the rotation count: ");
		int c=sc.nextInt();
		int temp[]=new int[arr1.length];
		for(int i=0;i<c;i++) {
			temp[i]=arr1[arr1.length-c+i];
		}
		for(int i=c;i<arr1.length;i++) {
			temp[i]=arr1[i-c];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		sc.close();
	}

}
