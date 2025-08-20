package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class LowerCaseToUpperCaseViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine();
		String res=str.toUpperCase();
		System.out.println("The uppercase are: "+res);
		System.out.println("The lowecase are: "+res.toLowerCase());
		sc.close();
	}

}
