package com.other.numbers;

import java.util.*;

public class numberProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a,temp,b=0;
		a=scan.nextInt();
		temp=a;
		
		while(temp>0) {
			b=b*10+temp%10;
			temp=temp/10;
		}
		if(a==b) {
			System.out.println("Palandrome");
		}else {
			System.out.println("no");
		}
	}

}
