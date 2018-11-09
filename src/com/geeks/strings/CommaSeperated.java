package com.geeks.strings;
import java.util.*;
public class CommaSeperated {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	String st=scan.nextLine();
	String words="",numbers="";
	String[] strarr=st.split(",");
	for(int i=0;i<strarr.length;i++) {
		if(strarr[i].matches("[a-z]*")) {
			words=words+" "+strarr[i];
			System.out.println(strarr[i]);
		}
		else if(strarr[i].matches("[0-9]*")) {
			numbers=numbers+" "+strarr[i];
		}
	}
	
	System.out.println(words+"\n"+numbers);
	}
}
