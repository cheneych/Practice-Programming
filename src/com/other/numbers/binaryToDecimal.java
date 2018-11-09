package com.other.numbers;

public class binaryToDecimal {

	public static void main(String[] args) {
		String str="101";
		
		int dec=toDecimal(str);
		System.out.println(dec);
	}

	private static int toDecimal(String str) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				j=(int) (j+Math.pow(2, str.length()-1-i));
			}
		}
		return j;
	}
}
