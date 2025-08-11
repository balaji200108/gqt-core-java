package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringSum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		int sum_cap_vo=0;
		int sum_sma_vo=0;
		int prod_con=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					sum_cap_vo=sum_cap_vo+str.charAt(i);
				}
				else {
					prod_con= prod_con*str.charAt(i);
				}
			} else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					sum_sma_vo=sum_sma_vo+str.charAt(i);
				}
				else {
					prod_con= prod_con*str.charAt(i);
				}
			}
		}
		System.out.println(sum_cap_vo);
		System.out.println(sum_sma_vo);
		System.out.println(prod_con);
	}

}
