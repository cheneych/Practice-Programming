package com.other.numbers;

import java.util.Scanner;

public class recursivePalandrome {

	public static void main(String[] args) {
		int counter=0,num,rev;
		
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		
		while(!isPalandrome(num)) {
		rev = reverse(num);	
		num=num+rev;
		counter++;
		}
		System.out.println("Counter: "+counter+" Palandrome"+num);
	}

	public static int reverse(int num) {
		// TODO Auto-generated method stub
		int temp=num,rev=0;
		while(temp>0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		return rev;
		
	}

	public static boolean isPalandrome(int num) {
		// TODO Auto-generated method stub
		
		int rev=reverse(num);
		if(rev==num)
			return true;
		else
			return false;
	}
}
