package com.gqt.corejava.RcArrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,6,1,5,9};
		int res[]=new int[arr1.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<k;j++) {
				if (arr1[i]==res[j]) {
					c++;
				}
			}
			if (c==0) {
				res[k++]=arr1[i];
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
