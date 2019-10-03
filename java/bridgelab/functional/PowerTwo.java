package com.java.bridgelab.functional;

public class PowerTwo {

	public static void main(String[] args) {
	 System.out.println("Enter number");
	 int N=Integer.parseInt(args[0]);
	 if(N>=0&&N<32) {
		 for(int i=0;i<N;i++) {
			 double num=Math.pow(2, i);
			 System.out.println(num);
		 }
	 }
	}

}