package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class FibonaaciSeriesRecursion {
	static int fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int c=sc.nextInt();
		for(int i=0;i<c;i++) {
			System.out.println(fibo(i));
		}
	}

}
