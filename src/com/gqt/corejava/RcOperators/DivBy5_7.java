package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class DivBy5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=sc.nextInt();
		if(x%5==0 && x%7==0) {
			System.out.println("The number "+x+" is divisible by both 5 and 7");
		}
		else {
			System.out.println("The number "+x+" is not divisible by both 5 and 7");
			if(x%5==0) {
				System.out.println("But divisible by 5 only");
			}
			else if(x%7==0){
				System.out.println("But divisible by 7 only");
			}
		}
		sc.close();
	}

}
