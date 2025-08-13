package com.gqt.corejava.RcArrays;

public class CountPosNegZeroOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,4,-3,-2,0,12,90,-4};
		int zero_cou=0;
		int pos_coun=0;
		int neg_coun=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero_cou++;
			}
			else if(arr[i]>0) {
				pos_coun++;
			}else {
				neg_coun++;
			}
		}
		System.out.println("The count of zero's is: "+zero_cou);
		System.out.println("The count of positive number's is: "+pos_coun);
		System.out.println("The count of Negative number's is: "+neg_coun);
		
	}

}
