package com.gqt.corejava.threads;
import java.util.Scanner;
public class ThreadCode2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int res = num1+num2;
		System.out.println("result = "+res);
		System.out.println("Additional Operation completed");
		
		System.out.println("Printing Operation Started");
		for (int i=1;i<=10;i++) {
			System.out.println("Happy 6 years to GQT");
			Thread.sleep(3000);
		}
		System.out.println("Printing Operation completed");
		System.out.println("Banking operation started..");
		System.out.println("Enter the account number: ");
		 int acc =sc.nextInt();
		 System.out.println("Enter the pin number:");
		 int pin=sc.nextInt();
		 System.out.println("Data Entered");
		 System.out.println("Banking operation completed.");
	}
}
