package com.gqt.corejava.RcStrings;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Strings :");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");
		if(str1.length()!=str2.length()) {
			System.out.println("Not a anagram..");
		}else {
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram..");
			}else {
				System.out.println("Not a anagram..");
			}
		}
		sc.close();
	}

}
