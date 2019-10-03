package com.java.bridgelab.OopS;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONExample {

	public static void main(String[] args) throws IOException {
		JSONObject jsob=new JSONObject();
	Map obj=new HashMap();
	obj.put("name","basmati");
	obj.put("weight","50");
	obj.put("price","500");
	jsob.put("rice",obj);
	System.out.println(jsob);
      FileWriter fl=new FileWriter("check.json");
      fl.write(jsob.toJSONString());
      fl.flush();
      fl.close();
	}

}
