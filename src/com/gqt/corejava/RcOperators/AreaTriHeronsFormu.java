package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class AreaTriHeronsFormu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 3 sides length of traingle: ");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("the area of the triangle= "+area);
		sc.close();
		
	}

}
