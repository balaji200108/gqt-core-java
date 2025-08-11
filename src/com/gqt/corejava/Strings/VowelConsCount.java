package com.gqt.corejava.Strings;

import java.util.Scanner;

public class VowelConsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
						||str.charAt(i)=='O'||str.charAt(i)=='U') {
					vowel_count++;
				}
			else {
				cons_count++;
			}
					}
		}
		System.out.println("vowels count ="+vowel_count);
		System.out.println("consonents count ="+cons_count);
	}
}