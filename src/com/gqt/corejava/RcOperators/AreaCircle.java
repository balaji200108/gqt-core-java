package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius=sc.nextDouble();
		double area= Math.PI*radius*radius;
		System.out.println("The area of the circle is: "+area);
		sc.close();
	}

}
