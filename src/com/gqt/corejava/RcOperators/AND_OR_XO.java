package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class AND_OR_XO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the values: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("AND of 2 numbers is: "+(a&b));
			System.out.println("OR of 2 numbers is: "+(a|b));
			System.out.println("XOR of 2 numbers is: "+(a^b));
			sc.close();
	}

}
