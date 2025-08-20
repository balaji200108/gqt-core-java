package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class SimpleInterst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the principle amount: ");
		double prin=sc.nextInt();
		System.out.print("Enter the rate of interest: ");
		double rate=sc.nextInt();
		System.out.print("Enter the time period(in years): ");
		double time=sc.nextInt();
		double SI=prin*rate*time/100;
		System.out.println("Simple Interest= "+SI);
		sc.close();
	}

}
