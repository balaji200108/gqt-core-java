package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String str = sc.nextLine();

	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter and append the rest
	                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	                result.append(capitalized).append(" ");
	            }
	        }
	        System.out.println("Capitalized String: " + result.toString().trim());
	}

}
