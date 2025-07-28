package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the size");
	      int n=sc.nextInt();
	      int b=1;
	      for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print(b+" ");
	  b=b+1;
	    	  }
	    	  System.out.println();
	      }
	      sc.close();
		}


}
