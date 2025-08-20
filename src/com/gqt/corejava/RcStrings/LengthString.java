package com.gqt.corejava.RcStrings;
import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String str= sc.nextLine();
		System.out.println("The length  of the string is: "+str.length());
		sc.close();
	}

}
