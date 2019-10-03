package com.java.bridgelab.functional;

import java.util.*;
class Check{
	void matchCoupan(int num) {
		int max=100;
		int min=999;
		int count=0;
		for(int i=0;i<1000000;i++) {
			int number=(int)(Math.random() * ((max - min) + 1)) + min;
			if(num==number) {
				System.out.println(i);
                break;
			}
		}
	}
}
public class Coupan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 digit number of coupan");
		int n1=sc.nextInt();
		Check obj=new Check();
		obj.matchCoupan(n1);
		
	}

}
