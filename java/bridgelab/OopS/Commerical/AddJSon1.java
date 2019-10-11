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

public class AddJSon1 {

	public static void main(String[] args) throws IOException, ParseException {
		/*JSONArray arr=new JSONArray();
		FileReader fr=new FileReader("ADDjson2.json");
		JSONParser parser=new JSONParser();
		Object objj=parser.parse(fr);
		JSONArray objjj=(JSONArray)objj;
		JSONObject objjjj;
		for(int i=0;i<objjj.size();i++) {
		objjjj=(JSONObject)objjj.get(i);
		arr.add(objjjj);
		}
		
		
		//System.out.println(objjjj);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name");
		String name=sc.next();
		System.out.println("Enter home");
		String home=sc.next();
		System.out.println("Enter code");
		String code=sc.next();
		JSONObject ob=new JSONObject();
		ob.put("name",name);
		ob.put("home",home);
		JSONObject obj=new JSONObject();
		obj.put(code,ob);
		arr.add(obj);
		FileWriter fl=new FileWriter("ADDjson2.json");
		fl.write(JSONValue.toJSONString(arr));
		fl.flush();
		fl.close();*/
		
		
		FileReader fr1=new FileReader("ADDjson2.json");
		boolean bool=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		JSONParser parser1=new JSONParser();
		Object objj1=parser1.parse(fr1);
		JSONObject objjjj1;
		JSONArray objjj1=(JSONArray)objj1;
		for(int i=0;i<objjj1.size();i++) {
		objjjj1=(JSONObject)objjj1.get(i);
		if(objjjj1.get(str) != null) {
		System.out.println(objjjj1);
		System.out.println(objjjj1.get("op"));
		}
		}
		

	}

}
