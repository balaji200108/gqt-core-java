package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			 for (int j = i; j >= 0; j--) {
	                System.out.print(j);
	            }
	            // ascending part
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	}

}
}