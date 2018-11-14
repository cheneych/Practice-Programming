package com.other.oop;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		Boolean swapped=false;
		for(int i=0;i<arr.length-1;i++) {
			swapped=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				//swap values
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int n;
//		n=scan.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
		int arr[] ={3,4,5,1,2,6};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
