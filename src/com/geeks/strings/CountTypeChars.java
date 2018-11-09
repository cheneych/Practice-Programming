package com.geeks.strings;

import java.util.Scanner;

public class CountTypeChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int n=Integer.parseInt( scan.next());
	   	String temp=scan.nextLine();//Solves the \n problem due to the previous next
	   	
	   	for(int j=0;j<n;j++) {
	   		String str=scan.nextLine();
	   		int uCase=0,lCase=0,nums=0,splChars=0;
	   		for(int i=0;i<str.length();i++) {
	   			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
	   				nums++;
	   			}else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
	   				uCase++;
	   			}else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
	   				lCase++;
	   			}else {
	   				splChars++;
	   			}
	   			}
	   		System.out.println(uCase+"\n"+lCase+"\n"+nums+"\n"+splChars);
	   	}
	}
}
