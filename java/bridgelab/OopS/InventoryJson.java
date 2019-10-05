package com.java.bridgelab.OopS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryJson {
	static long Total=0;
			public static void askCustomer(int n) throws IOException, ParseException {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter Type Of Inventory");
				String type=sc.nextLine();
				System.out.println("enter amount of "+type);
				long kg=sc.nextLong();
				read(type,kg);
			
			}
			
			
			public static void read(String type,long kg) throws IOException, ParseException {
				int m=0;
				if(type.equals("Rice")) {
					m=0;
				}
				if(type.equals("Pulse")) {
					m=1;
				}
				if(type.equals("Wheat")) {
					m=2;
				}
				FileReader fr=new FileReader("MainInventory.json");
				JSONParser parser=new JSONParser();
				Object ob=parser.parse(fr);
				JSONArray array=(JSONArray)ob;
				JSONObject obj;
				//int Rice=0,Pulse=1,Wheat=2;
				//for(int i=0;i<array.size();i++) {
					obj=(JSONObject)array.get(m);
					JSONObject job=(JSONObject)obj.get(type);
					long price=(long) job.get("price");
					String brand=(String)job.get("name");
					System.out.println("Brand of "+type+"="+" "+brand);
					System.out.println("price of 1 kg of"+type+"=="+price);
					long total=kg*price;
			         Total=total+Total;
					System.out.println("Total price of"+type+"==="+total);
					System.out.println("Total Amount you have to paid"+" "+Total);
					//break;
					}
				//}
			
	
	
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Items");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		askCustomer(n);
		}

	}

}
