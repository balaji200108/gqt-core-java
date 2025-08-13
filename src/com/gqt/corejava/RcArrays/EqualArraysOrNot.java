package com.gqt.corejava.RcArrays;

public class EqualArraysOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		int l1=arr1.length;
		int l2=arr2.length;
		if(l1!=l2) {
			System.out.println("Lengths are differnt so arrays are not equal");
		}else {
			for(int i=0;i<l1;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays are not equal");
					break;
				}
			}
			System.out.println("Arrrays are equal..");
		}
	}

}
