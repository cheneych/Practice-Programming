package com.other.numbers;

import java.util.*;

/*
 * 
 * Given an array of n (between 10 to 20) integers 1 through 9,
 *  return the index of the lowest unique integer
 *   (i.e. [1, 8, 2, 5, 2, 1, 6, 9, 7, 8] -> returns index 3 from value 5)
 * 
 * */
public class SmallestNonRepNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] check= {1, 8, 2, 5, 2, 1, 6, 9, 7, 8};
		int[] arr=new int[10];
		Arrays.fill(arr, 0);
		int min=10,ind;
//		HashMap<Integer,Integer> hm=new HashMap<>();
//		for(int i=0;i<check.length;i++) {
//			if(hm.containsKey(check[i])) {
//				hm.values()
//			}
		
		//}
		for(int i =0;i<check.length;i++) {
			arr[check[i]]++;
		}
		for(int i=0;i<check.length;i++) {
			if(check[i]<min && check[i]>0 && arr[check[i]]==1) {
				min=check[i];
				ind=i;
				}
		}
		
	
		
	}}


