package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class CountOccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name=sc.nextLine();
		name=name.toLowerCase();
		int c[]= new int[256];
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch!=' ') {
				c[ch]++;
			}
		}
		for(int i=0;i<256;i++) {
			if(c[i]>0) {
				System.out.println("the count of "+(char) i+": "+c[i]);
			}
		}
	}

}
