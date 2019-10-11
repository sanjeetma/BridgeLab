package com.java.bridgelab.oops.Commerical;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		StockAccount obj=new StockAccount();
		//obj.valueOf();
		System.out.println("enter your choice");
		System.out.println("Enter 1 to buy Share");
		System.out.println("Enter 2 to sell Share");
		System.out.println("Enter 3 to add file");
		System.out.println("Enter 4 check  Company");
		System.out.println("Enter 5 to check all details of comapny");
		System.out.println("Enter 6 to exit");
		int choice=sc.nextInt();
		boolean ask=true;
		switch(choice) {
		
		case 1:
			System.out.println("enter number of Share");
			int amount=sc.nextInt();
			System.out.println("enter symbol of company");
			String symbol = sc.next();
			obj.buy(amount, symbol);
			break;
		case 2:
			System.out.println("enter number of Share");
			int amount1=sc.nextInt();
			System.out.println("enter symbol of company");
			String symbol1=sc.next();
			obj.sell(amount1,symbol1);
			break;
		case 3: 
			System.out.println("Enter company name");
			String str=sc.next();
			obj.stockaccount(str);
			break;
		case 4: 
			double total=obj.valueOf();
			System.out.println("TOTAL VALUE OF COMPANY="+total);
			break;
		case 5:
			obj.printReport();
			break;
		default:
			System.out.println("Good Bye");
			ask=false;
			break;
		}
		
		
	}

}
