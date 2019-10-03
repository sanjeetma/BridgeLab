package com.java.bridgelab.functional;

import java.util.*;
public class SumZero {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of Array");
	int len=sc.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter element of Araay");
	for(int i=0;i<len;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Counting Triplets");
	int count=0;
	for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++){
			for(int k=j+1;k<len;k++) {
				if(arr[i]+arr[j]+arr[k]==0) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					
				}
				
			}
		}
	}
	if(count==0) {
		System.out.println("No Triplets Sum to Zero");
	}
	}

}