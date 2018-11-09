package com.other.numbers;

import java.util.Scanner;

public class amstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		if(isAmstrong(scan.nextInt()))
			System.out.println("Is Amstrong Number");
		else 
			System.out.println("Not Amstrong Number");
		
		
	}

	public static boolean isAmstrong(int nextInt) {
		// TODO Auto-generated method stub
		int n= order(nextInt);
		
		int temp=nextInt,sum=0;
		while(temp>0) {
			sum=(int) (sum+Math.pow(temp%10, n));
			temp=temp/10;		
		}
		if(sum==nextInt)
			return true;
		return false;
	}

	public static int order(int nextInt) {
		// TODO Auto-generated method stub
		int temp=0;
		while(nextInt>0) {
			temp++;
			nextInt=nextInt/10;
		}
		return temp;
	}

}
