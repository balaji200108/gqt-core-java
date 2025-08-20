package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=sc.nextLine();
		str=str.replace(" ", "");
		System.out.println(str);
		sc.close();
	}

}
