package com.other.oop;

import java.lang.reflect.Array;

public class FirstLastArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,1};
		
		arr=ArraySwapper(arr);

		for(int i=0;i<Array.getLength(arr);i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] ArraySwapper(int[] arr) {
		// TODO Auto-generated method stub
		int size=Array.getLength(arr),temp;
		for(int i=0;i<size/2;i++) {
			temp =arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		return arr;
		
	}

	

	

}
