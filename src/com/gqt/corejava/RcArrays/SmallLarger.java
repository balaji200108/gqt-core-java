package com.gqt.corejava.RcArrays;

public class SmallLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,8,29,24,87,123,9000,276,1};
		int lar=arr[0];
		int small=arr[0];
		for(int i=0;i<arr.length;i++) { 
			if(arr[i]>lar) {
				lar=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Largest Number in the array is: "+lar);
		System.out.println("Smallest Number in the array is: "+small);
	}

}
