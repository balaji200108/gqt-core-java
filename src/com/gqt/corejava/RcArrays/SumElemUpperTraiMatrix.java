package com.gqt.corejava.RcArrays;

public class SumElemUpperTraiMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1,2,3,5},
				{4,5,6,8},
				{7,8,9,10},
				{12,13,1,15}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[0].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("The Sum of upper triangle elements is: "+sum);
	}

}
