package com.other.oop;


import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,1};
	 
		removeDups(arr,Array.getLength(arr));
		

	}

	private static void removeDups(int[] arr, int size) {
		// TODO Auto-generated method stub
		
		Set set=new HashSet<Integer>(size);
		for(int value: arr) {
			if(!set.contains(value)) {
				set.add(value);
				
			}
			
		}
		
		set.forEach(System.out::println);
	}

}
