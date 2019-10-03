package com.java.bridgelab.functional;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter year");
		int year=Integer.parseInt(args[0]);
		if(year>999&&year<10000) {
			if(year%4==0&&year%400==0&&year%100!=0) {
				System.out.println("leap year");
				
			}
			else{
				System.out.println("not leap year");
			}
		}
		else {
			System.out.println("not valid year");
		}

	}

}