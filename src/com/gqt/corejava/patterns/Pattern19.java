package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size");
	int n=sc.nextInt();
	int b=1;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(b+" ");
		b=b+1;
		}
		System.out.println();
	}
	sc.close();
	}
}
