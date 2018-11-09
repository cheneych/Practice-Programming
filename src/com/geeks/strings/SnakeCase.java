package com.geeks.strings;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SnakeCase {
	
		public static void main (String[] args) {
			Scanner scan=new Scanner(System.in);
		    int n= scan.nextInt();
		    int c;
		    String s=new String();
		    String temp=new String();
		    for(int i=0;i<n;i++){
		        c=scan.nextInt();
		        String temp1=scan.next();
		        temp=temp1+scan.nextLine();
		        
		        System.out.println(temp.replace(" ","_").toLowerCase());
		        
		    }
			
		}
	}
	
	


