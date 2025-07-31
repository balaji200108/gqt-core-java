package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
	}
			 for (char j = 'A'; j < 'A' + i; j++) {
	                System.out.print(j);
	            }
	            for (char j = 'A'; j < 'A' + (i - 1); j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	}
sc.close();
}
}