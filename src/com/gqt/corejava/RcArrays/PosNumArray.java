package com.gqt.corejava.RcArrays;

public class PosNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,-4,20,34,-90,12,-90,180};
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>0) {
				sum=sum+arr1[i];
			}
		}
		System.out.println("The Sum of positive Numbers in an Array is: "+sum);
	}

}
