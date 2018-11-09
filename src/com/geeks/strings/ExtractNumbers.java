package com.geeks.strings;

import java.util.Scanner;

public class ExtractNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int n=Integer.parseInt( scan.next());
	   	String temp=scan.nextLine();//Solves the \n problem due to the previous next
	    String ans=new String();
	    ans=" ";
	   	for(int i=0;i<n;i++) {
	   		String str=scan.nextLine();
	   		for(int j=0;j<str.length();j++) {
	   		if(str.charAt(j)>=48 && str.charAt(j)<=57) {
	   			ans+=str.charAt(j);
	   		}else{		
	   			ans+=" "; 
		   		}
		   		}
		  	ans=ans.replaceAll("\\s{2,}", " ").trim();
	   	if(ans.length()<1) {
	   		System.out.println("No Integers");
	   	}else {
	   	
	   		System.out.println(ans);
	   		ans="";
	   	}
	}
	}


}