package com.gqt.corejava.patterns;

import java.util.Scanner;

public class PatternN6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
    	for(int i=0;i<=n;i++) {
		for(int j=0;j<=5;j++) {
			if(  j==0 || i==(n/2) || i==(n) || j==(n/2) && i>=(n/2) || i==0 )  
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