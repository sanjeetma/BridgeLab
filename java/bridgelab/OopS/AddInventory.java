package com.java.bridgelab.OopS;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class AddInventory {

	public static void main(String[] args) throws IOException {
		JSONArray jsarr=new JSONArray();    ////////item 1 value
		JSONObject item1=new JSONObject();
		item1.put("name","Basamati");
		item1.put("price",new Long(100));
		item1.put("weigth",new Long(1000));
		
		JSONObject item1val=new JSONObject();
		item1val.put("Rice",item1);
		jsarr.add(item1val);
		
		
		JSONObject item2 =new JSONObject();    ///////////item 2 value
		item2.put("name","gram");
		item2.put("price",new Long(80));
		item2.put("weigth",new Long(1000));
		
		JSONObject item2val=new JSONObject();
		item2val.put("Pulse", item2);
		jsarr.add(item2val);
		
		 
		 JSONObject item3=new JSONObject();                        /////////item 3 value
         item3.put("name","Ashirvad");
         item3.put("price",new Long(60));
         item3.put("weigth",new Long(1000));
         JSONObject item3val=new JSONObject();
         item3val.put("Wheat",item3);
         jsarr.add(item3val);
         
         
         
         
         FileWriter fl=new FileWriter("MainInventory.json");       ////writing json object in file
         fl.write(JSONValue.toJSONString(jsarr));
         fl.flush();
         fl.close();
	}

}
