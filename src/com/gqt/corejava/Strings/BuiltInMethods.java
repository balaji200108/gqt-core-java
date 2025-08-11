package com.gqt.corejava.Strings;

public class BuiltInMethods {

	public static void main(String[] args) {
	String str = "sachinRameshTendulkar";
	//1.length()
	int len = str.length();//it will provide the total length of the string
	
	//2.charAt()
	System.out.println("The Length Of the string is = "+len);
	char c = str.charAt(0);//it will provide the character at the specified position
	System.out.println("The Length at 0th position  = "+c);
	
	//c=str.charAt(100);//it leads to IndexOutOfBounds exception as we have only 21 positions
	//System.out.println("The Length at 0th position  = "+c);
	
	//3.concat()
	String str1=str.concat(" is the best batsmen in the cricket.");
	System.out.println(str1);
	
	//4.conatins()
	boolean res1=str.contains("Ramesh");//it will check if substring is present in the main string
	System.out.println(res1);
	res1=str.contains("Damesh");
	System.out.println(res1);
	
	//5.endsWith()
	boolean res2=str.endsWith("Tendulkar");//it will check if substring is present at the end of main string
	System.out.println(res2);
	res2=str.endsWith("Dendulkar");
	System.out.println(res2);
	
	//6.startsWith()
	boolean res3=str.startsWith("Sachin");//it will check if substring present at the start of the main string
	System.out.println(res3);
	res3=str.startsWith("Dachin");
	System.out.println(res3);
	
	//7.getClass()
	Class c1=str.getClass();//it will provide the root class path of the object
	System.out.println(c1);
	
	//8.hashCode()
	int hc=str.hashCode();//it will return the hash value of the given object
	System.out.println("Hashcode= "+hc);
	
	//9.indexOf()
	int index1=str.indexOf('T');//it ill provide the index of the specified charecter in the main string
	System.out.println("The index of T is= " +index1);
	index1=str.indexOf('z');
	System.out.println("The index of z is= " +index1);
	
	//10.isBlank()
	boolean res4=str.isBlank();//checks if the string is empty or has spaces
	System.out.println(res4);
	String str2="      ";
	res4=str.isBlank();//checks if the string is empty or has spaces
	System.out.println(res4);
	String str3="";
	res4=str.isBlank();//checks if the string is empty or has spaces
	System.out.println(res4);
	
	//11.isEmpty()
			boolean res5=str.isEmpty();
			System.out.println(res5);
			res5=str2.isEmpty();
			System.out.println(res5);
			res5=str3.isEmpty();
			System.out.println(res5);
			
			//12.lastIndexOf()
			int n2=str.lastIndexOf('a');
			System.out.println("The last of letter 'a' is ="+n2);
			n2=str.lastIndexOf('z');
			System.out.println("The last of letter 'z' is ="+n2);//if given char not available then it will return -1 value
			
			//13.replace()
			String res6=str.replace('S','$');
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
