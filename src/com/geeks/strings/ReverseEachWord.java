package com.geeks.strings;
import java.util.*;
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="erehw era uoy  a";
		str.trim();
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}
			else {
				while(!st.isEmpty()) {
				System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
			}
		
	}
}
