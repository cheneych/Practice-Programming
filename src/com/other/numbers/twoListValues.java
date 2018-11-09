package com.other.numbers;
/*
 * Given two lists as input ex. 1,2,3,4;5,6,7. Print the last integer 
 * of first list and first integer of second list. 
 * If they are same only print one, 
 * if not print in ascending order ex. 5,4.
 * 
 * */
public class twoListValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {2,5,6,3,22};
		
		if(arr1[arr1.length-1]==arr2[arr2.length-1])
			System.out.println(arr1[arr1.length-1]);
		else if(arr1[arr1.length-1]>arr2[arr2.length-1])
			System.out.println(arr1[arr1.length-1]+","+arr2[arr2.length-1]);
		else
			System.out.println(arr2[arr2.length-1]+","+arr1[arr1.length-1]);
	}

}
