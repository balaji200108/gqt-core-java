package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class CompundInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of int in perc: ");
        double r = (sc.nextDouble())/100;
        System.out.print("Enter Time in years: ");
        double t = sc.nextDouble();
        System.out.print("Enter number of times interest is compounded per year : ");
        int n = sc.nextInt();
        double A=p*Math.pow(1+r/n,n*t);
        double CI=A-p;
        System.out.println("Compound Interrest is:"+CI);
        sc.close();

	}

}
