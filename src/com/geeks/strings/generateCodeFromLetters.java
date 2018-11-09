package com.geeks.strings;

import java.util.Scanner;

/*
 * Every letter is associated with a number as a-1, b-2 , .... 
 * So if the string is abcd it should give the output as 0123,
 *  if the string is with any special characters the output has
 *   to be "none". Input: abcdefgh Output: 01234567 If the input 
 *   is anything other than small letters(alphabets), 
 *   
 *   the output should be none
 * */

public class generateCodeFromLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str= scan.nextLine();
		str.trim();
		
		double value=toCode(str);
		System.out.println(String.format("%.0f", value));
	}
	
	public static double toCode(String str) {
		String st="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				st=st+((int)str.charAt(i)-'a'+1);
			}
		}
		return Double.parseDouble(st);
	}

}
