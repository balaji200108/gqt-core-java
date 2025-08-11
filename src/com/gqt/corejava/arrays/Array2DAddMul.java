package com.gqt.corejava.arrays;

public class Array2DAddMul {
	    public static void main(String[] args) {

	        int[][] arr1 = {
	                {1, 2},
	                {3, 4}
	        };
	        int[][] arr2 = {
	                {5, 6},
	                {7, 8},
	        };

	        // Step 1: Multiplication (2x3) * (3x2) = (2x2)
	        int[][] result = new int[arr1.length][arr2[0].length];

	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2[0].length; j++) {
	                for (int k = 0; k < arr2.length; k++) {
	                    result[i][j] += arr1[i][k] * arr2[k][j];
	                }
	            }
	        }

	        System.out.println("Resultant Matrix after Multiplication:");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Step 2: Extract 2x2 sub-matrix from arr1 for addition
	        int[][] subArr1 = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                subArr1[i][j] = arr1[i][j]; // take first two columns
	            }
	        }

	        // Step 3: Perform addition (result 2x2 + extracted 2x2)
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                result[i][j] = result[i][j] + subArr1[i][j];
	            }
	        }

	        System.out.println("\nResultant Matrix after Addition with subarray of arr1:");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}