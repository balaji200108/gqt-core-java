package com.gqt.corejava.threads;
import java.util.Scanner;
class Addition{
	void add() {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result = "+res);
		System.out.println("Addition Operation completed");
	}
}
class Printing{
	void print() {
		System.out.println("Prining Operation Started");
		for(int i=1;i<=10;i++) {
			System.out.println("Happy 6 years to GQT");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Prining Operation completed");
	}
}
class Banking{
	void bank() {
		System.out.println("Banking Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		int accno = sc.nextInt();
		System.out.println("Enter the pin number : ");
		int pin = sc.nextInt();
		System.out.println("data entered");
		System.out.println("Banking Operation completed");
	}
}
public class ThreadCode3 {
	public static void main(String[] args) {
		Addition a = new Addition();
		Printing p = new Printing();
		Banking b = new Banking();
		
		a.add();
		p.print();
		b.bank();
	}
}
