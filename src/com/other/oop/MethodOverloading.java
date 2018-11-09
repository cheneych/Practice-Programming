package com.other.oop;


abstract class addition{
	private int a,b,c;
	
	public int add(int a,int b) {
		return a+b;
	}

	abstract public int add(int i, int j, int k);
	
}

public class MethodOverloading extends addition {
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
		MethodOverloading aa=new MethodOverloading();
		System.out.println(aa.add(1,2,3));
	}
}
