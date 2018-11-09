package com.geeks.strings;

import java.util.Scanner;

public class ConvertStringUL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner ss=new Scanner(System.in);
		
		n=Integer.parseInt(ss.next());
		String temp = ss.nextLine();
		
		for(int i=0;i<n;i++) {
			convertString(ss.nextLine());
		}

	}

	public static void convertString(String str) {
		// TODO Auto-generated method stub
		String temp="";
		for(int i=0;i<str.length();i++) {
			str=str.replaceAll("[aeiouAEIOU]", "");
			//if(!(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')) {
				if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
					
							temp+="#"+Character.toLowerCase(str.charAt(i));;
					}
					else {
						
						temp+="#"+Character.toUpperCase(str.charAt(i)); 
					}
				//}
			}
		System.out.println(temp);
	}
		
	}


