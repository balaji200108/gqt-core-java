package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class PalindromeOrNotUsiRecursion {
	static int reverse(int num, int rev) {
        if (num == 0)
            return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    static boolean isPalindrome(int num) {
        return num == reverse(num, 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if (isPalindrome(n))
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");

	}
}
