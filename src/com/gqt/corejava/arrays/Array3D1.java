package com.gqt.corejava.arrays;
import java.util.Scanner;
class ArrayOperations2 {
	    String  [][][]arr;
	    Scanner sc = new Scanner(System.in);

	    void createArray() {
	    	System.out.println("Enter school count:");
	        int sch = sc.nextInt();
	        System.out.println("Enter class count in each school3"+ ":");
	        int cls = sc.nextInt();
	        arr =new String[sch][cls][];
	        System.out.println("Enter student count in each class:");
	        int stu = sc.nextInt();
	        arr = new String[sch][cls][stu];
	        System.out.println("Array is created");
	        System.out.println("---------------------");
	    }

	    void collectData() {
	    	 for (int i = 0; i < arr.length; i++) {
		            System.out.println("Inside school no: " + (i + 1));
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.println("Enter number of the class " + (j + 1) + ": ");
		                for(int k=0;k<arr[i][j].length;k++) {
		                	System.out.println("The name of the student: "+(k+1)+":");
		               arr[i][j][k] = sc.next();
		                }
	            }
	        }
	        System.out.println("Data Collected");
	        System.out.println("-------------------");
	    }

	    void displayData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside school no: " + (i + 1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("The number of class no: " + (j + 1) + " is = " + arr[i][j]);
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println("The name of student no: " + (k + 1) + " is = " + arr[i][j][k]);
	                }
	            }
	        }
	        System.out.println("---------------");
	    }
	}
public class Array3D1 {

	public static void main(String[] args) {
		ArrayOperations2 ao = new  ArrayOperations2();
        ao.createArray();
        ao.collectData();
        ao.displayData();

	}

}
