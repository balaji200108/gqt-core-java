package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern66X {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();
	    	for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(  i==j || j+i==(n-1) )
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
