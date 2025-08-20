package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class PowerNumber {
	static int power(int base,int power) {
		if(power==0) return 1;
		return base*power(base,power-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base=sc.nextInt();
		System.out.println("Enter the power: ");
		int pow=sc.nextInt();
		System.out.println("The power is: "+power(base,pow));
		sc.close();
	}
}
