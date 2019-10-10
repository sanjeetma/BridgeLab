package com.java.bridgelab.OopS.InventoryManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.*;

public class StockAccount implements Stock {
	String Symbol;
	 double nos;
	 double price;
	 
	public String getSymbol() {
		return Symbol;
	}



	public void setSymbol(String symbol) {
		Symbol = symbol;
	}



	public double getNos() {
		return nos;
	}



	public void setNos(double nos) {
		this.nos = nos;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void Stockaccount(String file) throws IOException {
		Scanner sc=new Scanner(System.in);
		 
	System.out.println("Enter company symbol");
   	 String symbol=sc.next();
   	 setSymbol(symbol);
   	 System.out.println("Enter number of stock");
   	 double nos=sc.nextDouble();
   	 setNos(nos);
   	 
   	 System.out.println("Enter Price of Stock");
   	 double price=sc.nextDouble();
   	 setPrice(price);
   	 JSONObject obj=new JSONObject();
   	 obj.put("symbol", getSymbol());
   	 obj.put("nos", new Double(getNos()));
   	 obj.put("price", getPrice());
   	 FileWriter fl=new FileWriter(file+".json");
   	 System.out.println("Added Succesfully");
   	 fl.write(JSONValue.toJSONString(obj));
   	 fl.flush();
   	 fl.close();
   	 sc.close();
    }

		


	@Override
	public double valueOf() throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		double total=0;
		System.out.println("Enter name of company");
		 String name=sc.next();
    	 File file =new File(name+".json");
    	 if(file.exists()) {
    		 FileReader fl=new FileReader(name+".json");
    		 JSONParser parser=new JSONParser();
    		 Object ob=parser.parse(fl);
    		 JSONObject obj=(JSONObject)ob;
    		 String symbol=(String)obj.get("symbol");
    		 Double nos=(Double)obj.get("nos");
    		 Double price=(Double)obj.get("price");
    		 System.out.println("your company symbol is:"+"  "+symbol);
    		 System.out.println("your number of share is:"+" "+nos);
    		 System.out.println("your price f one share:"+" "+price);
    		 total=nos*price;
    		 
    	 }
    	 else {
    		 System.out.println("oops....File not Found");
    	 }
 		return (total);
     }



	@Override
	public void buy(int amount, String symbol) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		double totalshare=0;
		
    	 File file =new File(symbol+".json");
    	 if(file.exists()) {
    		 FileReader fl=new FileReader(symbol+".json");
    		 JSONParser parser=new JSONParser();
    		 Object ob=parser.parse(fl);
    		 JSONObject obj=(JSONObject)ob;
    		 String symbol1=(String)obj.get("symbol");
    		 Double nos=(Double)obj.get("nos");
    		 Double price=(Double)obj.get("price");
    		 System.out.println("your company symbol is:"+"  "+symbol1);
    		 System.out.println("your number of share is:"+" "+nos);
    		 System.out.println("your price f one share:"+" "+price);
    		
    		 System.out.println("see you soon");
    		 totalshare=nos+amount;
    		 System.out.println("Total Share"+totalshare);
    		 if(file.delete()) {
    			 String file1=symbol;
    			 obj.put("symbol", symbol1);
    		   	 obj.put("nos", new Double(totalshare));
    		   	 obj.put("price", price);
    		  
    		   	 FileWriter fw=new FileWriter(file1+".json");
    		   	 System.out.println("Added Succesfully");
    		   	 fw.write(JSONValue.toJSONString(obj));
    		   	 fw.flush();
    		   	 fw.close();
    		   	 sc.close();
    		    }
    			 
    		 }
    	 
    	 else {
    		 System.out.println("oops....File not Found");
    	 }
 		
     }


		

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public void sell(int amount, String symbol) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		double totalshare=0;
		
   	 File file =new File(symbol+".json");
   	 if(file.exists()) {
   		 FileReader fl=new FileReader(symbol+".json");
   		 JSONParser parser=new JSONParser();
   		 Object ob=parser.parse(fl);
   		 JSONObject obj=(JSONObject)ob;
   		 String symbol1=(String)obj.get("symbol");
   		 Double nos=(Double)obj.get("nos");
   		 Double price=(Double)obj.get("price");
   		 
   		 System.out.println("your company symbol is:"+"  "+symbol1);
   		 System.out.println("your number of share is:"+" "+nos);
   		 System.out.println("your price f one share:"+" "+price);
   		if(nos>amount) {
   		 totalshare=nos-amount;
   		 System.out.println("Total share="+totalshare);
   		if(file.delete()) {
			 obj.put("symbol", symbol1);
		   	 obj.put("nos", new Double(totalshare));
		   	 obj.put("price", price); 
		   	
		   	 FileWriter fw=new FileWriter(symbol+".json");
		   	 System.out.println("Added Succesfully");
		   	 fw.write(JSONValue.toJSONString(obj));
		   	 fw.flush();
		   	 fw.close();
		   	 sc.close();
		    }
			
   		}
   		else {
   			System.out.println("Not Enough Share");
   		}
   	 }
   	 
   	 else {
   		 System.out.println("oops....File not Found");
   	 }
   	 
		
		
	}

	@Override
	public void save(String file) {
		
		
	}

	@Override
	public void print() throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name ofCompany");
		String str=sc.next();
		 File file =new File(str+".json");
    	 if(file.exists()) {
    		 FileReader fl=new FileReader(str+".json");
    		 JSONParser parser=new JSONParser();
    		 Object ob=parser.parse(fl);
    		 JSONObject obj=(JSONObject)ob;
    		 String symbol=(String)obj.get("symbol");
    		 Double nos=(Double)obj.get("nos");
    		 Double price=(Double)obj.get("price");
    		 System.out.println("your company symbol is:"+"  "+symbol);
    		 System.out.println("your number of share is:"+" "+nos);
    		 System.out.println("your price of one share:"+" "+price);
	}

}
}
