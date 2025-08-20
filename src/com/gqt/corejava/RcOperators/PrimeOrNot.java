package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=sc.nextInt();
		boolean p=true;
		if(x<=1) {
			System.out.println(x+" is not a prime");
		}
		else {
			for(int i=2;i<=Math.sqrt(x);i++) {
				if(x%i==0) {
					p=false;
					break;
				}
			}	
		}
		if(p) {
			System.out.println(x+" is a prime ");
		}
		else {
			System.out.println(x+" is not a prime ");
		}
		sc.close();
	}

}
