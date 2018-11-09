package com.geeks.strings;

/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
	int in;
	String a=new String();

	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	in=scan.nextInt();

	
	for(int i=0;i<in;i++){
	    a=scan.next();
	   char[] ss=a.toCharArray();
	    for(char c: ss){
	        if(c>='A' && c<='Z'){
	            char t=(char) (c+32);
	            System.out.print(t);
	        }
	        else{
	            System.out.print(c);
	        }
	    }
	    System.out.println("");
	}
	
		
	}
}