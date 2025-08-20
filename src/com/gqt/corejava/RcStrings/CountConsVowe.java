package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class CountConsVowe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		int v_co=0;
		int c_co=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					v_co++;
				}else {
					c_co++;
				}
			}
		}
		System.out.println("The vowel count is = "+v_co);
		System.out.println("The consonant count is = "+c_co);
		sc.close();
	}

}
