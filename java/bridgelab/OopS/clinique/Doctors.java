package com.java.bridgelab.OopS.clinique;

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

public class Doctors {
    String name;
    String docid;
    String special;
   String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocid() {
		return docid;
	}
	public void setDocid(String docid) {
		this.docid = docid;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	void addNewDocFile() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Doctors");
		String name=sc.next();
		setName(name);
		System.out.println("Enter  Doctors id");
		String docid=sc.next();
		setDocid(docid);
		System.out.println("Enter speciality of Doctors");
		String special=sc.next();
		setSpecial(special);
		System.out.println("Enter Availbility of doctor AM or PM");
		String time=sc.next();
		setTime(time);
		
		
		FileWriter fw=new FileWriter("Doctors.json");
		JSONArray mainarray=new JSONArray();
		
		JSONArray jsarr=new JSONArray();
		JSONObject obj=new JSONObject();
		obj.put("name",getName());
		obj.put("id", getDocid());
		obj.put("speciality",getSpecial());
		obj.put("get", getTime());
		JSONObject obj1=new JSONObject();
		obj1.put("doctor",obj);
		jsarr.add(obj1);
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
	}
	@SuppressWarnings("unchecked")
	void addAnotherDocDetails() throws IOException, ParseException {
		JSONArray jsarr=new JSONArray();
		FileReader fr1=new FileReader("Doctors.json");
		JSONParser parser1=new JSONParser();
		Object ob=parser1.parse(fr1);
		JSONArray jsarr1=(JSONArray)ob;
		JSONObject obj2 = null;
		for(int i=0;i<jsarr1.size();i++) {
	     obj2=(JSONObject)jsarr1.get(i);
	     jsarr.add(obj2);
		
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Doctors");
		String name=sc.next();
		setName(name);
		System.out.println("Enter  Doctors id");
		String docid=sc.next();
		setDocid(docid);
		System.out.println("Enter speciality of Doctors");
		String special=sc.next();
		setSpecial(special);
		System.out.println("Enter Availbility of doctor AM or PM");
		String time=sc.next();
		setTime(time);
		
		
		FileWriter fw=new FileWriter("Doctors.json");
		JSONArray mainarray=new JSONArray();
		
		
		JSONObject obj=new JSONObject();
		obj.put("id",getDocid());
		obj.put("name",getName());
		obj.put("speciality",getSpecial());
		obj.put("get", getTime());
		JSONObject obj1=new JSONObject();
		obj1.put("doctor",obj);
		jsarr.add(obj1);
		
		
		
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
		
		
	}
	void read() throws IOException, ParseException {
		FileReader fr=new FileReader("Doctors.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray jsarr=(JSONArray)ob;
		JSONObject obj;
		System.out.println("id"+" "+"Speciality"+" "+"name"+" "+"timiming");
		System.out.println();
		for(int i=0;i<jsarr.size();i++) {
		 obj=(JSONObject)jsarr.get(i);
		JSONObject obj1=(JSONObject)obj.get("doctor");
		String str=(String)obj1.get("name");
		String id=(String)obj1.get("id");
		String speciality=(String)obj1.get("speciality");
		String get=(String)obj1.get("get");
		System.out.print(id+" ");
		System.out.print(speciality+" ");
		System.out.print(str+" ");
		System.out.print(get+" ");
		System.out.println();
		System.out.println();
		}
	}
	void checkAvail() throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id of Doctor");
		String id=sc.next();
		FileReader fr=new FileReader("Doctors.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONObject obj = null;
		JSONArray jsarr=(JSONArray)ob;
		for(int i=0;i<jsarr.size();i++) {
		obj=(JSONObject)jsarr.get(i);
		JSONObject obj1=(JSONObject)obj.get("doctor");
		String str=(String)obj1.get("id");
		if(str.equals(id)) {
			String str2=(String)obj1.get("get");
			String name=(String)obj1.get("name");
		System.out.println("Timing of Doctor"+" "+name+" =="+str2);
		}
		}
	}
}
