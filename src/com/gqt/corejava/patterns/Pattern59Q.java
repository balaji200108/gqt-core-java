package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern59Q {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();
	    	for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if( i == 0 && j > 0 && j < n - 1 ||               // Top horizontal
	                    i == n - 2 && j > 0 && j < n - 1 ||           // Bottom horizontal (above tail)
	                    j == 0 && i > 0 && i < n - 2 ||               // Left vertical
	                    j == n - 1 && i > 0 && i < n - 2 ||           // Right vertical
	                    (i == j && i >= n / 2)            ) 
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
