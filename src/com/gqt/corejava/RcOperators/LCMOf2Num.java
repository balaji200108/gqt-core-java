package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class LCMOf2Num {
	public static int gcd1(int x,int y) {
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=0;
		lcm=(a*b)/gcd1(a,b);
		System.out.println("The Lcm of 2 numbers is: "+lcm);
	}
	

}

