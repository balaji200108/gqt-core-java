package com.gqt.corejava.RcArrays;
import java.util.Arrays;
public class MergeSortedArrays {

	public static void main(String[] args) {
		 int arr1[] = {2, 5, 8,21};
	        int arr2[] = {9, 15, 20};
	        int res[] = new int[arr1.length + arr2.length];
	        int i = 0, j = 0, k = 0;
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                res[k++] = arr1[i++];
	            } else {
	                res[k++] = arr2[j++];
	            }
	        }
	        while (i < arr1.length) {
	            res[k++] = arr1[i++];
	        }
	        while (j < arr2.length) {
	            res[k++] = arr2[j++];
	        }
	        System.out.println(Arrays.toString(res));
	}

}
