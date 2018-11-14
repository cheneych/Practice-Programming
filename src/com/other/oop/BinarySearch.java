package com.other.oop;
import java.util.*;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		
		int a= binarySearch(arr,0,arr.length-1,key);
		System.out.println(a);
	}

	public static int binarySearch(int[] arr, int l,int r, int key) {
		if(r>=l) {
		int mid=l+(r-1)/2;
		if(arr[mid]==key) 
			return mid;
		 if(key<arr[mid]) 
			return binarySearch(arr, l, mid-1, key);
		
			//(key>arr[mid]) {
		return binarySearch(arr, mid+1, r, key);
		
	
		
	}
		return -1;
		

}
}
