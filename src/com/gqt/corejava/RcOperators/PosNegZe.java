package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class PosNegZe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Number is a positive..");
		}
		else if(a<0) {
			System.out.println("Number is a Negative..");
		}
		else {
			System.out.println("Number is a zero..");
		}
	}

}
