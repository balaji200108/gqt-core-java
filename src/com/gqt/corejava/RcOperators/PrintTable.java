package com.gqt.corejava.RcOperators;
import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the table: ");
		int a=sc.nextInt();
		for(int  i=1;i<=10;i++) {
			System.out.println(a+ "X"+i+" = "+(a*i));
		}
		sc.close();
	}

}
