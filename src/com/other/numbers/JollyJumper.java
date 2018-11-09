package com.other.numbers;
import java.util.*;
public class JollyJumper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] arr= {1,4,2,3};
		
		Boolean a=checkJollyJumper(arr); 
		System.out.println(a);
		

	}

	public static Boolean checkJollyJumper(int[] arr) {
		// TODO Auto-generated method stub
		Boolean[] diff=new Boolean[arr.length];
		Arrays.fill(diff, Boolean.FALSE);
		
		for(int i=0;i<arr.length-1;i++) {
			
			int val =Math.abs(arr[i]-arr[i+1]);
			if(val==0 ||val >arr.length-1 || diff[val]==true)
				return false;
				
			diff[val]=true;	
		}
		return true;
	}

}
