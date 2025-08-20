package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class StringContainsOnlyDigitsorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String str = sc.nextLine();
	        boolean allDigits = true;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!(ch >= '0' && ch <= '9')) {
	                allDigits = false;
	                break;
	            }
	        }
	        if (allDigits) {
	            System.out.println("Contains all digits...");
	        } else {
	            System.out.println("Contains non-digit characters...");
	        }
	}

}
