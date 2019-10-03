package com.java.bridgelab.functional;

import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int head=0;
		int tail=0;
		System.out.println("Enter  number of times");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			double num=Math.random();		
		    if(num<0.5) {
		    	tail++;
		    }
		    else {
		    	head++;
		    }
		}
		float headPercent=(head*100)/n;
		float tailPercent=(tail*100)/n;
		System.out.println(headPercent);
		System.out.println(tailPercent);
	}

}
