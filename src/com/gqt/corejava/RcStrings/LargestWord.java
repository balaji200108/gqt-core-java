package com.gqt.corejava.RcStrings;
import java.util.Scanner;
public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine();
		String wor[]=str.split(" ");
		String larwor="";
		for(String word:wor) {
			if(word.length()>larwor.length()) {
				larwor=word;
			}
		}
		System.out.println("Largest word="+larwor);
		sc.close();
	}

}
