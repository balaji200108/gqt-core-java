package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year%400==0) {
			System.out.println(year+" is leap year.");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println(year+" is leap year.");
		}
		else {
			System.out.println(year+" is not a leap year.");
		}
		sc.close();
	}

}
