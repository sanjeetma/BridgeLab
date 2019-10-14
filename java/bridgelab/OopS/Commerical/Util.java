package com.java.bridgelab.oops.Commerical;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Util {
           static Scanner sc=new Scanner(System.in);
           public static int intInput() {
        	   return sc.nextInt();
           }
           public static String stringInput() {
        	   return sc.next();
           }
           public static double doubleInput() {
        	   return sc.nextDouble();
           }
           
           /////////Read JSON file//////////////////////
           
         public static void readJsonFile() throws IOException, ParseException {
        	 FileReader fr=new FileReader("Share.json");
     		JSONParser parser=new JSONParser();
     		Object ob=parser.parse(fr);
     		JSONArray jarr=(JSONArray)ob;
     		JSONObject job;
     		for(int i=0;i<jarr.size();i++) {
     			job=(JSONObject)jarr.get(i);
     				JSONObject job1=(JSONObject) job.get("Company");
     				String name=(String) job1.get("Name");
     				 double nos=(double) job1.get("nos");
     			     String symbol1=(String) job1.get("Symbol");
     				 Double price=(double) job1.get("price");
     				System.out.println("Name of company="+name);
     				System.out.println("symbol of company="+symbol1);
     				System.out.println("Number of share="+nos);
     				System.out.println("price of share="+price);
     				System.out.println("######################################");
         }
    }
         
         public static void writeJsonFile(JSONArray jarr) {
        	 try {
				FileWriter fw=new FileWriter("Address.json");
				fw.write(JSONValue.toJSONString(jarr));
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	 
         }
}
