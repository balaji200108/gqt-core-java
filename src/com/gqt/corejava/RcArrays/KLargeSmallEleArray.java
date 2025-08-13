package com.gqt.corejava.RcArrays;
import java.util.Scanner;
public class KLargeSmallEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr1[]= {1,5,239,87,23,9,508,34,2};
		System.out.println("Enter the kth value: ");
		int k = sc.nextInt();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if (arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		System.out.println("The second Largest Element of array  is: "+arr1[arr1.length-k]);
		System.out.println("The second Smallest Element of array  is: "+arr1[k-1]);
		sc.close();
	}

}
