package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern41 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size:");
     int n=sc.nextInt();
     for(int i=0;i<=n;i++) {
    	 for(int j=0;j<=i;j++) {
    		 if(i==0||i==(n-1)||i==0) {
    		 System.out.print("# ");
    	 }
    	 else {
    		 System.out.print("- ");
    	 }
    	 System.out.println();
     }

	}
	}
}
