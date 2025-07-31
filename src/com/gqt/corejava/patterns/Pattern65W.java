package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern65W {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();
	    	for(int i=0;i<=n;i++) {
			for(int j=0;j<=n*4;j++) {
				if(  j == i ||                                      // Leftmost diagonal
	                    j == n * 2 - 1 - i ||                           // Second diagonal
	                    j == n * 2 - 1 + i ||                           // Third diagonal
	                    j == n * 4 - 2 - i )
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
