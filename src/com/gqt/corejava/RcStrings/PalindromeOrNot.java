package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("The resultant string is = "+res);
		if(res.equals(str)==true) {
			System.out.println("Palindrome...");
		}
		else {
			System.out.println("Not a Palindrome....");
		}
		sc.close();
	}

}
