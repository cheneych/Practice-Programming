package com.other.oop;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,12,1,33,10,3,2,10};
		
		insertionSort(arr);

	}

	public static void insertionSort(int[] arr) {
		int key,j;
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
