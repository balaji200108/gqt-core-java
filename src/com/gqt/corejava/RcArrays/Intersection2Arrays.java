package com.gqt.corejava.RcArrays;

public class Intersection2Arrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,5,8,10,2};
		int arr2[]= {3,2,8,12,5};
		int res[]= new int[arr1.length];
		int n= 0;
		for (int i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr2.length; j++) {
		        boolean alreadyAdded = false;
		        for (int k = 0; k < n; k++) {
		            if (res[k] == arr1[i]) {
		                alreadyAdded = true;
		                break;
		            }
		        }
		        if (arr1[i] == arr2[j] && !alreadyAdded) {
		            res[n++] = arr1[i];
		        }
		    }
		}
		for (int i = 0; i < n; i++) {
		    System.out.print(res[i] + " ");
		}
	}

}
