package com.gqt.corejava.patterns;
import java.util.Scanner;
public class New {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Ente the value:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int x=i*2;
	for(int j=1;j<=i;j++) {
			System.out.print(x+"*");
		}
		System.out.println();
	}
}
}
