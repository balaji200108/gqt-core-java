package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class ReverseStringRecursion {
	static String reverse(String name) {
		if (name.length()==0) return "";
		return name.charAt(name.length() - 1) + reverse(name.substring(0, name.length() - 1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println(reverse(name));
}
}