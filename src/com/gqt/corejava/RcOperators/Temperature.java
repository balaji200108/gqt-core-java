package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit: ");
		double far=sc.nextDouble();
		double cel=(far-32)*5/9;
		System.out.println("the temperature after converting from fahrenheit to celsius is :" +(cel));
		sc.close();
	}

}
