package com.gqt.corejava.RcArrays;

public class ArrayPalindrome {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,2,1,10};
		boolean isPali=true;
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i]!=arr1[arr1.length-1-i]) {
				isPali=false;
				break;
			}
		}
		if(isPali) {
			System.out.println("Palinndrome");
		}
		else {
			System.out.println("Not a Palinndrome");
		}

	}

}
