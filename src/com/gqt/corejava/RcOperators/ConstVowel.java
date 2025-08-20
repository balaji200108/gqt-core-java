package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class ConstVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c= sc.next().toLowerCase().charAt(0);
		if(!Character.isLetter(c)) {
			System.out.println("Not valid");
		}
		else if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {
			System.out.println("vowel....");
		}
		else {
			System.out.println("Consatnt");
		}
		sc.close();
	}

}
