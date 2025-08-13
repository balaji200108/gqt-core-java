package com.gqt.corejava.RcArrays;

public class SumOfEachRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1,2,3,5},
				{4,5,6,8},
				{7,8,9,10},
				{12,13,1,15}};
		int sum_row=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sum_row+=arr[i][j];
			}
			System.out.println("The sum of "+(i+1)+" row is: "+sum_row);
			sum_row=0;
		}
		int sum_col=0;
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum_col+=arr[j][i];
			}
			System.out.println("The sum of "+(i+1)+" column is: "+sum_col);
			sum_col=0;
		}
	}

}
