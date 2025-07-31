package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern60S {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();
	    	for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(  i == 0 && j > 0 && j < n - 1 ||        // Top horizontal
	                    i == n / 2 && j > 0 && j < n - 1 ||    // Middle horizontal
	                    i == n - 1 && j > 0 && j < n - 1 ||    // Bottom horizontal
	                    j == 0 && i > 0 && i < n / 2 ||        // Left vertical (top half)
	                    j == n - 1 && i > n / 2 && i < n - 1 )  // Right vertical (bottom half)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
