package com.gqt.corejava.Strings;

public class StringCode2 {

	public static void main(String[] args) {
		String s1="BALAJI";
		String s2="BALAJI";
		String s3="balaji";
		String s4="SUBBU";
		System.out.println("case1: same Strings");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------");
		if(s1==s2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are not equal");
		}
		System.out.println("==============");
		System.out.println("case2: different Strings");
		if(s1.equalsIgnoreCase(s4)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------");
		if(s1==s4) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are not equal");
		}
		System.out.println("==============");
		System.out.println("case3: same Strings but different case");
		if(s1.equalsIgnoreCase(s3)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------");
		if(s1==s3) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are not equal");
		}

	}

}
