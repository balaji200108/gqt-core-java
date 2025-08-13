package com.gqt.corejava.RcArrays;

public class FreqElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr1[] = {1, 6, 3, 5, 78, 9, 2, 1, 6, 2, 78, 9, 10, 9};
	        boolean visited[] = new boolean[arr1.length];

	        for (int i = 0; i < arr1.length; i++) {
	            if (visited[i]) continue;

	            int count = 1;
	            for (int j = i + 1; j < arr1.length; j++) {
	                if (arr1[i] == arr1[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            System.out.println("The count of " + arr1[i] + " is: " + count);
	        }
	}

}
