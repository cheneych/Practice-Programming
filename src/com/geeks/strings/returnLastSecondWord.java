package com.geeks.strings;

public class returnLastSecondWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Here is the second last word";
		String ret = secondLastWord("e,as asr+");
		System.out.println(ret);
	}

	public static String secondLastWord(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=0)
			return " ";
		
		str.trim();
		str=str.replaceAll("[,]*", " ");
		String[] strarr=str.split("\\s");
		int len=strarr.length;
		
		return strarr[len-2];
	}

}
