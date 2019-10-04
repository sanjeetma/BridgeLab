import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Checkjson {

	public static void main(String[] args) throws IOException, ParseException {
		JSONObject js=new JSONObject();
		JSONArray jsarr=new JSONArray();
		js.put("name","basmati");
		js.put("price",100);
		js.put("weight",20);		
		JSONObject jso=new JSONObject();
		jso.put("Rice",js);
		jsarr.add(jso);
		
		JSONObject js1=new JSONObject();
		js1.put("name","moong");
		js1.put("price",100);
		js1.put("weight",30);
		JSONObject jso1=new JSONObject();
		jso1.put("Rice",js1);
		jsarr.add(jso1);

		FileWriter file=new FileWriter("Checkjson.json");
	     file.write(JSONValue.toJSONString(jsarr));
	     file.flush();
	     file.close();
	     
	     FileReader fr=new FileReader("Checkjson.json");
	     JSONParser parser= new JSONParser();
	     Object ob=parser.parse(fr);
	     JSONArray jarr=(JSONArray)ob;
	     System.out.println(jarr);
	     JSONObject job;
	     for(int i=0;i<jarr.size();i++) {
	    	 job=(JSONObject)jarr.get(i);
             JSONObject jos=(JSONObject)job;
             String str=(String) job.get("price");
             System.out.print(str);

	     }
	     
	     
	}
	

}