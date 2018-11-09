package com.other.numbers;

import java.util.Scanner;

public class minNumOfCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int count_5=0,count_3=0,count_1=0,tot;
		//int count = 0,tot;
		tot= scan.nextInt();
//		int tot_val=tot;
//		while(tot>0) {
//			if(tot>=5) {
//				tot=tot-5;
//				count++;
//			}else if(tot>=3) {
//				tot=tot-3;
//				count++;
//			}else if(tot>=1) {
//				tot=tot-1;
//				count++;
//			}	
//		}
		count_5=tot/5;
		count_3=(tot-(count_5*5))/3;
		count_1=(tot-(count_5*5)-(count_3*3));
		int count=count_5+count_3+count_1;
		//int count=count_5+count_3+count_1;
		
		System.out.println("The Min number of Coins required to get "+tot+" is "+count);
		
	}

}
