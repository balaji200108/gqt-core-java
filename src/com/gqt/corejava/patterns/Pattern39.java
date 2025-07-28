package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern39 {

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
			for (char j = (char) ('A' + i); j >= 'A'; j--) {
                System.out.print(j);
            }
            // ascending part
            for (char j = 'B'; j <= (char) ('A' + i); j++) {
                System.out.print(j);
}
            System.out.println();
}
}
}