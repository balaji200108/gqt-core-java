package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattren4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count:");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			System.out.print(i);
		}

}
}