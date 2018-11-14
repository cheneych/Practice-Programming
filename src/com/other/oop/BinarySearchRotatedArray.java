/*
 *An element in a sorted array can be found in O(log n) time via binary search.
 *But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
 *So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
 *Devise a way to find an element in the rotated array in O(log n) time.
 * 
 * */

package com.other.oop;
import java.util.*;
public class BinarySearchRotatedArray {
	 static int search(int arr[], int l, int h, int key) 
	    { 
	        if (l > h)  
	            return -1; 
	        
	        int mid = (l+h)/2; 
	        if (arr[mid] == key) 
	            return mid; 
	        
	        /* If arr[l...mid] is sorted */
	        if (arr[l] <= arr[mid]) 
	        { 
	            /* As this subarray is sorted, we  
	               can quickly check if key lies in  
	               half or other half */
	            if (key >= arr[l] && key <= arr[mid]) 
	               return search(arr, l, mid-1, key); 
	        
	            return search(arr, mid+1, h, key); 
	        } 
	        
	        /* If arr[l..mid] is not sorted,  
	           then arr[mid... r] must be sorted*/
	        if (key >= arr[mid] && key <= arr[h]) 
	            return search(arr, mid+1, h, key); 
	        
	        return search(arr, l, mid-1, key); 
	    } 

	public static void main(String[] args) {
		//int arr[] ={3,4,5,1,2,3,6};
		Scanner scan=new Scanner(System.in);
		int n,key;
		n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		key=scan.nextInt();
		
		int i=search(arr, 0, arr.length-1, key);
		System.out.println(i);
		
		
	}

}
