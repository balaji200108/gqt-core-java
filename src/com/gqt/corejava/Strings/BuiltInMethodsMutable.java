package com.gqt.corejava.Strings;

public class BuiltInMethodsMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("balaji ch");
		StringBuilder sb1= new StringBuilder("gopi ch");
		
		//1.length()
		System.out.println("The length of string-1 is : "+sb.length());
		System.out.println("The length of string-2 is : "+sb1.length());
		
		//2.append()
//		sb.append(1.98);
//		sb1.append(" is a MBA student.");
//		System.out.println(sb);
//		System.out.println(sb1);
		
		//3.capacity()
		StringBuffer sb3= new StringBuffer("");
		System.out.println(sb3.capacity());// for empty  string the capacity is 16 by default 
		System.out.println(sb.capacity());// by default it is 16 and then it will add the length of string
		System.out.println(sb1.capacity());
		
		
		//4.charAt()
		System.out.println(sb.charAt(5));
		System.out.println(sb1.charAt(9));
//		System.out.println(sb.charAt(15)); //Index 15 out of bounds for length 12
//		System.out.println(sb1.charAt(19));//Index 19 out of bounds for length 11
		
		//5.delete()
//		sb.delete(7, 12);
//		System.out.println(sb);
//		sb1.delete(7, 10);
//		System.out.println(sb1);
		
//		//6.deleteCharAt()
//		sb.deleteCharAt(0);
//		System.out.println(sb);
//		sb1.deleteCharAt(0);
//		System.out.println(sb1);
		
		//7.equals()
		StringBuffer sb4= new StringBuffer("balaji ch");
		System.out.println(sb.equals(sb4));//it will check references not content
		
		//8.getClass()
		System.out.println(sb.getClass());
		
		//9.reverse()
//		System.out.println(sb.reverse());
		
		//10.substring(int start,int end)
		System.out.println(sb.substring(6, 12));
		
		//11.toString()
		sb.toString();
		System.out.println(sb.getClass());
		
		sb.setCharAt(0, 'D');
		System.out.println(sb);
//		System.out.print(sb.setCharAt(6, 'c'));
		
		sb.replace(7, 15, "balu");
		System.out.println(sb);
		
	}

}
