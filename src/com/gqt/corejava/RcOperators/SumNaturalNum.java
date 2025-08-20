package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class SumNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int t=sc.nextInt();
		int sum=0;
		sum=t*(t+1)/2;
		System.out.println("Sum of natural numbers: "+sum);
	}

}
