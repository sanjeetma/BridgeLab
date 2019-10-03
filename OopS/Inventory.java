package com.java.bridgelab.OopS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {
	@SuppressWarnings("unchecked")
	 static void writeDetails() throws IOException {
		JSONArray jarr=new JSONArray();
		jarr.add("Rice:basmati");
		jarr.add("price:100");
		jarr.add("Weight:50");
		
		
        jarr.add("pulse:moong");
		jarr.add("price:200");
		jarr.add("weight:20");
		
		
		jarr.add("wheat:ashirvad");
		jarr.add("price:500");
		jarr.add("weight:10");
		JSONObject obj=new JSONObject();
		obj.put("grain",jarr);
		
	     PrintWriter fw=new PrintWriter("Inventory.json");
		 fw.write(""+obj);
		  fw.flush();
		  fw.close();
		  //JSONArray grainList = new JSONArray();
	        //grainList.add(detailsObject);
	}
	
	public static void read() throws  FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		FileReader fr=new FileReader("Inventory.json");
		Object obj=parser.parse(fr);
		JSONObject job=(JSONObject)obj;
		JSONArray jarr=(JSONArray)job.get("grain");
		Iterator iterator = jarr.iterator();
	    while (iterator.hasNext()) {
	       System.out.println(iterator.next());
	    }
	}

	public static void main(String[] args) throws IOException, ParseException {
		writeDetails();
		read();
		}

}
