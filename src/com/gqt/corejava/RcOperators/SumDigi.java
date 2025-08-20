package com.gqt.corejava.RcOperators;
import java.util.Scanner;

public class SumDigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int s=0;
		while(a>0) {
			int r=a%10;
			s=s+r;
			a=a/10;
		}
		System.out.println("The Sum of the digits of number is: "+s);
		sc.close();
	}

}
