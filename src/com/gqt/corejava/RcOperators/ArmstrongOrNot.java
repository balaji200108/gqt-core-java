package com.gqt.corejava.RcOperators;
import java.util.Scanner;
public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int x=num;
        int len= String.valueOf(num).length();
        int sum=0;
        while(num>0) {
        	int te=num%10;
        	sum=(int) (sum+ Math.pow(te, len));
        	num=num/10;
        }
        if(sum==x) {
        	System.out.println(x+" is an armstrong number..");
        }else {
        	System.out.println(x+" is not a armstrong number..");
        }
        sc.close();
	}

}
