package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class Factorial {
	static int fact(int n) {
		if(n==0 || n==1){ 
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("the factorial of a number is :"+fact(num));
	}

}
