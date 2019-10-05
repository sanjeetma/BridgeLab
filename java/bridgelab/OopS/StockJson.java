package com.java.bridgelab.OopS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockJson {

	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Stock name");
		String stock=sc.nextLine();
		System.out.println("enter price of one stock");
		long price=sc.nextLong();
		System.out.println("enter number of stock");
		long nos=sc.nextLong();
		
		
		JSONObject js=new JSONObject();
		JSONArray jsarr=new JSONArray();
		js.put("name",stock);
		js.put("price",price);
		js.put("nos",nos);		
		JSONObject jso=new JSONObject();
		jso.put("STOCK",js);
		jsarr.add(jso);
		
		/*JSONObject js1=new JSONObject();
		js1.put("name","moong");
		js1.put("price",new Long(500));
		js1.put("weight",new Long(70));
		JSONObject jso1=new JSONObject();
		jso1.put("Rice",js1);
		jsarr.add(jso1);*/

		FileWriter file=new FileWriter("Checkjson.json");
	     file.write(JSONValue.toJSONString(jsarr));
	     file.flush();
	     file.close();
	     
	     FileReader fr=new FileReader("Checkjson.json");
	     JSONParser parser= new JSONParser();
	     Object ob=parser.parse(fr);
	     JSONArray jarr=(JSONArray)ob;
	    // System.out.println(jarr);
	     JSONObject job;
	     for(int i=0;i<jarr.size();i++) {
	    	 job=(JSONObject)jarr.get(i);
            // String str=(String) job.get("rice");
	    	 JSONObject j=(JSONObject)job.get("STOCK");
	          String s=(String)j.get("name");
	    	 long w=(long)j.get("price");
	    	long p=(long)j.get("nos");
             System.out.println("Name of Comapny="+s);
             System.out.println("price of one share="+w);
             System.out.println("Number of share want="+p);
             long totalprice=w*p;
             System.out.println("Total price="+totalprice);
	     }
	     
	     
	}
	

}
