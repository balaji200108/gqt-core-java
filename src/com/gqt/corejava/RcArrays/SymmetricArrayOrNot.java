package com.gqt.corejava.RcArrays;

public class SymmetricArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},
				{2,5,6},
				{3,16,7}};
		
		boolean isSymmetric = true;

		if (arr.length != arr[0].length) {
		    isSymmetric = false; 
		} else {
		    for (int i = 0; i < arr.length; i++) {
		        for (int j = 0; j < arr.length; j++) {
		            if (arr[i][j] != arr[j][i]) {
		                isSymmetric = false;
		                break;
		            }
		        }
		        if (!isSymmetric) break;
		    }
		}

		if (isSymmetric) {
		    System.out.println("Matrix is symmetric");
		} else {
		    System.out.println("Matrix is not symmetric");
		}
	}

}
