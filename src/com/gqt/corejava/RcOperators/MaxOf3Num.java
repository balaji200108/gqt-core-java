package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class MaxOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is a maximum number among three....");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is a maximum number among three....");
		}
		else {
			System.out.println(c+" is a maximum number among three....");
	}
	}
}
		
