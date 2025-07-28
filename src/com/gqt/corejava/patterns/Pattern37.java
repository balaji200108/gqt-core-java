package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			 char start = (char) (ch + (2 * i - 2));
	            for (char j = start; j >= 'A'; j--) {
	                System.out.print(j);
			}
			System.out.println();
		}
sc.close();

	}

}
