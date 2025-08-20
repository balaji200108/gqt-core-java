package com.gqt.corejava.RcStrings;

public class BuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SachinRameshTendulkar";
		//1.length()
		int len=str.length();
		System.out.println("Length of the string is= "+len);
		
		//2.charAt()
		char c=str.charAt(0);
		System.out.println("The character at 0th position is= "+c);
		
//		c=str.charAt(100);//it leads to IndexOutOfBounds exception  as we have only 21 characters in main string
//		System.out.println("The character at 0th position is= "+c);
		
		//3.concat()
		String str1=str.concat(" is the best batsmen in the cricket.");
		System.out.println(str1);
		
		//4.conatins()
		boolean res1=str.contains("Ramesh");
		System.out.println(res1);
		res1=str.contains("Damesh");
		System.out.println(res1);
		
		//5.endsWith()
		boolean res2=str.endsWith("Tendulkar");
		System.out.println(res2);
		res2=str.endsWith("Dendulkar");
		System.out.println(res2);
		
		//6.startsWith()
		boolean res3=str.startsWith("Sachin");
		System.out.println(res3);
		res3=str.startsWith("Dachin");
		System.out.println(res3);
		
		//7.getClass()
		Class c1=str.getClass();
		System.out.println(c1);
		
		//8.hashCode()
		int hc=str.hashCode();
		System.out.println("Hashcode= "+hc);
		String s1="SachinRameshTendulkar";
		hc=s1.hashCode();
		System.out.println("Hashcode= "+hc);
		
		//9.indexOf()
		int n1=str.indexOf('T');
		System.out.println("The index of T is= " +n1);
		
		//10.isBlank()
		boolean res4=str.isBlank();
		System.out.println(res4);
		String str3="    ";
		res4=str3.isBlank();
		System.out.println(res4);
		String str4="";
		res4=str4.isBlank();
		System.out.println(res4);
		
		//11.isEmpty()
		boolean res5=str.isEmpty();
		System.out.println(res5);
		res5=str3.isEmpty();
		System.out.println(res5);
		res5=str4.isEmpty();
		System.out.println(res5);
		
		//12.lastIndexOf()
		int n2=str.lastIndexOf('a');
		System.out.println("The last of letter 'a' is ="+n2);
		n2=str.lastIndexOf('z');
		System.out.println("The last of letter 'z' is ="+n2);//if given char not available then it will return -1 value
		
		//13.replace()
		String res6=str.replace('a','$');
		System.out.println(res6);
		
		//14.substring(int start)
		String res7=str.substring(6);
		System.out.println(res7);
		
		//15.substring(int start, int end)
		String res8=str.substring(6, 12);
		System.out.println(res8);
		
		//16.toUpperCase()
		String res9=str.toUpperCase();
		System.out.println(res9);
		
		//17.toLowerCase()
		String res10=str.toLowerCase();
		System.out.println(res10);
	}

}
