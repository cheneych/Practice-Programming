package com.geeks.strings;

public class mapNumAndOperate {
	public static void main(String[] args) {
		String st= "123456 abc+xyz";
		int inspp = 0,insps;
		st.trim();
//		int a= st.indexOf(' ');
		//String b=st.substring(a, st.length());
		//System.out.println();
		String[] a=st.split("\\s");
		int insp = a[1].indexOf(' ');
		if(a[1].contains("+")) {
			 inspp=a[1].indexOf("+");
			 int a1=Integer.parseInt(a[0].substring(0, inspp));
			 int a2=Integer.parseInt(a[0].substring(inspp, a[0].length()));
			 System.out.println(a1+a2);
		}else if(a[1].contains("-")) {
			insps=a[1].indexOf("-");
		}
		
	}

}
