package com.java.bridgelab.oops.Commerical;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class AddJson {

	public static void main(String[] args) throws IOException {
		JSONArray jsarr=new JSONArray();
		JSONObject comp1=new JSONObject();
		comp1.put("Name","TATA");
		comp1.put("Symbol","TAT");
		comp1.put("nos",new Double(100));
		comp1.put("price",new Double(1000));
		
		JSONObject compdetails1=new JSONObject();
		compdetails1.put("TATA",comp1 );
		jsarr.add(compdetails1);
		

		JSONObject comp2=new JSONObject();
		comp2.put("Name","Reliance");
		comp2.put("Symbol","REL");
		comp2.put("nos",new Double(80));
		comp2.put("price",new Double(800));
		
		JSONObject compdetails2=new JSONObject();
		compdetails2.put("Reliance",comp2 );
		jsarr.add(compdetails2);
		
		FileWriter fl=new FileWriter("Share.json");
		fl.write(JSONValue.toJSONString(jsarr));
		fl.flush();
		fl.close();
		
	}

}
