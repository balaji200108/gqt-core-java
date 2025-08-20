package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition of 2 numbers is: "+(a+b));
		System.out.println("Substraction of 2 numbers is: "+(a-b));
		System.out.println("Multiplication of 2 numbers is: "+(a*b));
		System.out.println("Divison of 2 numbers is: "+(a/b));
		sc.close();
	}

}
