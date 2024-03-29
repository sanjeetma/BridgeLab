package com.java.bridgelab.oops.Commerical;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServiceImplementation implements Stock{
	public void stockaccount(String file) throws IOException, ParseException {
		StockAccount stock=new StockAccount();
		JSONArray arr=new JSONArray();
		FileReader fr=new FileReader("Share.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray jarr=(JSONArray)ob;
		JSONObject job;
		for(int i=0;i<jarr.size();i++) {
			job=(JSONObject)jarr.get(i);
			arr.add(job);
		}
		JSONObject obj2=new JSONObject();
		JSONObject obj=new JSONObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter symbol");
		String symbol=sc.next();
		stock.setSymbol(symbol);
		System.out.println("Enter number of share");
		double nos=sc.nextDouble();
		stock.setNos(nos);
		System.out.println("Enter price");
		double price=sc.nextDouble();
		stock.setPrice(price);
		obj.put("name",file);
		obj.put("Symbol", stock.getSymbol());
		obj.put("nos",new Double(stock.getNos()));
		obj.put("price",new Double(stock.getPrice()));
		obj2.put("Company",obj);
		arr.add(obj2);
		
		
		FileWriter fw=new FileWriter("Share.json");
		fw.write(JSONValue.toJSONString(arr));
		fw.flush();
		fw.close();
		
	}

	public double valueOf() throws IOException, ParseException { 
		System.out.println("Enter name of company");
		String name1=Util.stringInput();
		double total=0;
		FileReader fr=new FileReader("Share.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray jarr=(JSONArray)ob;
		JSONObject job;
		for(int i=0;i<jarr.size();i++) {
			job=(JSONObject)jarr.get(i);
				JSONObject job1=(JSONObject) job.get("Company");
				String name2=(String) job1.get("Name");
				if(name1.equals(name2)) {
				String name=(String) job1.get("Name");
				double nos=(double) job1.get("nos");
				String symbol=(String) job1.get("Symbol");
				double price=(double) job1.get("price");
				System.out.println("Name of company="+name);
				System.out.println("symbol of company="+symbol);
				System.out.println("Number of share="+nos);
				System.out.println("price of share="+price);
				total=nos*price;
				
				
				}
		}
		return total;
	}

	public void buy(int amount, String symbol) throws IOException, ParseException {
		LinkedListStack link=new LinkedListStack();
		double nos=0;
		String symbol1="";
		double price=0;
		JSONArray arr=new JSONArray();
		FileReader fr1=new FileReader("Share.json");
		JSONParser parser1=new JSONParser();
		Object ob1=parser1.parse(fr1);
		JSONArray jarr1=(JSONArray)ob1;
		JSONObject job2;
		for(int i=0;i<jarr1.size();i++) {
			job2=(JSONObject)jarr1.get(i);
			JSONObject job1=(JSONObject) job2.get("Company");
			String name=(String) job1.get("Name");
			if(!symbol.equals(name)) {
			arr.add(job2);
		}
		}
		double total=0;
		FileReader fr=new FileReader("Share.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray jarr=(JSONArray)ob;
		JSONObject job;
		for(int i=0;i<jarr.size();i++) {
			job=(JSONObject)jarr.get(i);
				JSONObject job1=(JSONObject) job.get("Company");
				String name=(String) job1.get("Name");
				if(symbol.equals(name)) {
				 nos=(double) job1.get("nos");
			     symbol1=(String) job1.get("Symbol");
				 price=(double) job1.get("price");
				System.out.println("Name of company="+name);
				System.out.println("symbol of company="+symbol1);
				System.out.println("Number of share="+nos);
				System.out.println("price of share="+price);
				link.push(symbol1, amount);
				total=nos+amount;
				System.out.println("Total number of Share="+total);
				JSONObject obj=new JSONObject();
				JSONObject obj2=new JSONObject();
				JSONArray jsarr=new JSONArray();
				obj.put("Name",name);
				obj.put("Symbol",symbol1);
				obj.put("nos", new Double(total));
				obj.put("price",new Double(price));
				obj2.put("Company", obj);
				arr.add(obj2);
				
				FileWriter fw=new FileWriter("Share.json");
				fw.write(JSONValue.toJSONString(arr));
				fw.flush();
				fw.close();
				
				link.display();
				
		}
		}
		
	}
	

	public void sell(int amount, String symbol) throws IOException, ParseException {
		double nos=0;
		String symbol1="";
		double price=0;
		JSONArray arr=new JSONArray();
		FileReader fr1=new FileReader("Share.json");
		JSONParser parser1=new JSONParser();
		Object ob1=parser1.parse(fr1);
		JSONArray jarr1=(JSONArray)ob1;
		JSONObject job2;
		for(int i=0;i<jarr1.size();i++) {
			job2=(JSONObject)jarr1.get(i);
			JSONObject job1=(JSONObject) job2.get("Company");
			String name=(String) job1.get("Name");
			if(!symbol.equals(name)) {
			arr.add(job2);
		}
		}
		double total=0;
		FileReader fr=new FileReader("Share.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray jarr=(JSONArray)ob;
		JSONObject job;
		for(int i=0;i<jarr.size();i++) {
			job=(JSONObject)jarr.get(i);
				JSONObject job1=(JSONObject) job.get("Company");
				String name=(String) job1.get("Name");
				if(symbol.equals(name)) {
				 nos=(double) job1.get("nos");
			     symbol1=(String) job1.get("Symbol");
				 price=(double) job1.get("price");
				System.out.println("Name of company="+name);
				System.out.println("symbol of company="+symbol1);
				System.out.println("Number of share="+nos);
				System.out.println("price of share="+price);
				total=nos-amount;
				System.out.println("Total number of Share="+total);
				JSONObject obj=new JSONObject();
				JSONObject obj2=new JSONObject();
				JSONArray jsarr=new JSONArray();
				obj.put("Name",name);
				obj.put("Symbol",symbol1);
				obj.put("nos", new Double(total));
				obj.put("price",new Double(price));
				obj2.put("Company", obj);
				arr.add(obj2);
				
				FileWriter fw=new FileWriter("Share.json");
				fw.write(JSONValue.toJSONString(arr));
				fw.flush();
				fw.close();
				
		}
		}
		
		
		
	}

	public void save(String filename) {
		
	}

	public void printReport() throws IOException, ParseException {
		LinkedListShare obj=new LinkedListShare();
		Util.readJsonFile();
				//obj.addAtFirst(symbol1,nos);
				
		}
		//obj.display();

}

//}
