package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattren5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count:");
		int b=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			b=i;
			for(int j=1;j<=n;j++) {	
			System.out.print(b+"  ");
	b=b+n;
		}
System.out.println();
		}
}
}