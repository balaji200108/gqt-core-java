package com.gqt.corejava.RcArrays;

public class SecLarSmallElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,5,239,87,23,9,508,34,2};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if (arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		System.out.println("The second Largest Element of array  is: "+arr1[arr1.length-2]);
		System.out.println("The second Smallest Element of array  is: "+arr1[1]);
	}

}
