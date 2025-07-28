package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern27 {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the size");
	      int n=sc.nextInt();
	      int k=1;
	      for(int i=1;i<=n;i++) {
	    	  for(int j=i;j<=n;j++) {
	    		  System.out.print("  ") ;
	    	  }
	    	  for(int j=1;j<=k;j++) {
	    		  System.out.print(i+" ");
	    	  }
	    	 k=k+2;
	    	  System.out.println();
	      }
	      sc.close();
		}
}
