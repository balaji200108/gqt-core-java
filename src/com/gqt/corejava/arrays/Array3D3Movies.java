package com.gqt.corejava.arrays;
import java.util.Scanner;
class movieOperations {
	    long  [][][]arr;
	    long investment;
	    long prev_profit;
	    long sum_revenue;
	    Scanner sc = new Scanner(System.in);

	    void createArray() {
	    	System.out.println("Enter language count:");
	        int lan = sc.nextInt();
	        System.out.println("Enter category count in each language"+ ":");
	        int cat = sc.nextInt();
	        arr =new long[lan][cat][];
	        System.out.println("Enter movie count in each category:");
	        int mov = sc.nextInt();
	        
	        arr = new long[lan][cat][mov];
	        
	        
	        System.out.println("Array is created");
	        System.out.println("---------------------");
	        
	        System.out.println("total investment: ");
	        investment=sc.nextLong();
	        System.out.println("total previous profit: ");
	        prev_profit=sc.nextLong();
	        System.out.println("---------------------");
	    }

	    void collectRevenueData() {
	    	 for (int i = 0; i < arr.length; i++) {
		            System.out.println("Inside laguage no: " + (i + 1));
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.println("The category number " + (j + 1) + ": ");
		                for(int k=0;k<arr[i][j].length;k++) {
		                	System.out.println("The revenue of the movie: "+(k+1)+":");
		               arr[i][j][k] = sc.nextLong();
		               sum_revenue +=arr[i][j][k];		                }
	            }
	        }
	        System.out.println("RevenueData Collected");
	        System.out.println("-------------------");
	    }

	    void displayData() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Inside language no: " + (i + 1));
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("The category no: " + (j + 1) + " is = " + arr[i][j]);
	                for(int k=0;k<arr[i][j].length;k++) {
	                	System.out.println("The revenue of movie no: " + (k + 1) + " is = " + arr[i][j][k]);
	                }
	            }
	        }
	        System.out.println("---------------");
	        if(sum_revenue>investment) {
	        	long profit=sum_revenue-investment;
	        	System.out.println("The profit earned by hemanth is:"+(profit));
	        	if(profit>prev_profit) {
	        		System.out.println("hemanth got more profit than last year.....");
	        	}else {
	        		System.out.println("hemanth got less profit than prev year.....");
	        	}
	        }else {
	        	System.out.println("The loss cursed by the  is : "+(investment-sum_revenue));
	        }
	        System.out.println("---------------");
	    }
	}
public class Array3D3Movies {
   public static void main(String[] args) {
	   movieOperations ao = new movieOperations();
        ao.createArray();
        ao.collectRevenueData();
        ao.displayData();

	}

}
