package com.java.bridgelab.OopS.InventoryManagement;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;
import java.util.*;
public class StockMain {
	
	public static void main(String[] args) throws IOException, ParseException {
		StockAccount obj=new StockAccount();
		Scanner sc = new Scanner(System.in);
	    	 System.out.println("select your option Below");
	    	 System.out.println("Enter 1 to add new company details");
	    	 System.out.println("Enter 2 to get Total Value");
	    	 System.out.println("Enter 3 to buy share");
	    	 System.out.println("Enter 4 to sell share");
	    	 System.out.println("Enter 5 to check company details");
	    	 int choice=sc.nextInt();
	    	 switch(choice) {
	    	 case 1:
	    		 System.out.println("Enter File Name");
	    		 String str=sc.next();
	    		obj. Stockaccount( str);
	    		 break;
	    	 case 2:
	    		 double total= obj.valueOf();
	    		 System.out.println("Total Value Of company="+total);
	    		 break;
	    	 case 3:
	    		 System.out.println("Enter company name");
	    		 String symbol=sc.next();
	    		 System.out.println("Enter number of Share");
	    	    int amount=sc.nextInt();
	    		 obj.buy( amount,symbol);
	    		 break;
	    	 case 4:
	    		 System.out.println("Enter company name");
	    		 String symbol1=sc.next();
	    		 System.out.println("Enter number of Share");
	    	    int amount1=sc.nextInt();
	    		 obj.sell( amount1,  symbol1);
	    		 break;
	    	 case 5:
	    		 obj.print();
	    		
	    		 break;
	        default:
	        	System.out.println("Invalid Choice");
	    		 
	    	 
	    	 }

	}
}


