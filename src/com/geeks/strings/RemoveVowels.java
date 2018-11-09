package com.geeks.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveVowels {
	
	public static void main (String[] args) {
		//code
		Scanner scan=new Scanner(System.in);
	    int n=Integer.parseInt( scan.next());
	   	String temp=scan.nextLine();//Solves the \n problem due to the previous next
	    for(int i=0;i<n;i++) {
	   
	    	String str=scan.nextLine();
	    	String str1=removeVowels(str);
	    	System.out.println(str1);
	    }
	    	
	}

	private static String removeVowels(String str) {
		// TODO Auto-generated method stub
		String str1=new String();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
			}
			else {
				str1+=str.charAt(i);
			}
		}
		return str1;
	}
}
