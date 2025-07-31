package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern45 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
    	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i == 0 && j < n - 1 ||        // top
                    i == n / 2 && j < n - 1 ||    // middle
                    i == n - 1 && j < n - 1 ||    // bottom
                    j == 0 ||                     // left side
                    (j == n - 1 && i != 0 && i != n / 2 && i != n - 1))
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
