package com.java.bridgelab.OopS.clinique;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Patient {
    String name;
    String patId;
    String mobile;
    String age;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatId() {
		return patId;
	}
	public void setPatId(String patId) {
		this.patId = patId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	void addNewPatientFile() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of patient");
		String name=sc.next();
		setName(name);
		System.out.println("Enter id of patient");
		String id=sc.next();
		setPatId(id);
		System.out.println("Enter mobile number of patient");
		String mobile=sc.next();
		setMobile(mobile);
		System.out.println("Enter age of patient");
		String age=sc.next();
		setAge(age);
		
		FileWriter fw=new FileWriter("Patient.json");
		JSONArray mainarray=new JSONArray();
		
		JSONArray jsarr=new JSONArray();
		JSONObject obj=new JSONObject();
		obj.put("name",getName());
		obj.put("id", getPatId());
		obj.put("mobile",getMobile());
		obj.put("age", getAge());
		JSONObject obj1=new JSONObject();
		obj1.put("Patient",obj);
		jsarr.add(obj1);
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
	}
	void addNewPatientRecord() throws IOException, ParseException {
		JSONArray jsarr=new JSONArray();
		FileReader fr1=new FileReader("Patient.json");
		JSONParser parser1=new JSONParser();
		Object ob=parser1.parse(fr1);
		JSONArray jsarr1=(JSONArray)ob;
		JSONObject obj2 = null;
		for(int i=0;i<jsarr1.size();i++) {
	     obj2=(JSONObject)jsarr1.get(i);
	     jsarr.add(obj2);
		
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of patient");
		String name=sc.next();
		setName(name);
		System.out.println("Enter id of patient");
		String id=sc.next();
		setPatId(id);
		System.out.println("Enter mobile number of patient");
		String mobile=sc.next();
		setMobile(mobile);
		System.out.println("Enter age of patient");
		String age=sc.next();
		setAge(age);
		
		FileWriter fw=new FileWriter("Patient.json");
		JSONArray mainarray=new JSONArray();
		
		JSONObject obj=new JSONObject();
		obj.put("name",getName());
		obj.put("id", getPatId());
		obj.put("mobile",getMobile());
		obj.put("age", getAge());
		JSONObject obj1=new JSONObject();
		obj1.put("Patient",obj);
		jsarr.add(obj1);
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
		
	}
	void read() throws IOException, ParseException{
		FileReader fr=new FileReader("Patient.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray Jsarr=(JSONArray)ob;
		JSONObject obj;
		System.out.println("Name"+" "+"mobile"+"    "+"id"+"   "+"age");
		System.out.println();
		for(int i=0;i<Jsarr.size();i++) {
			obj=(JSONObject)Jsarr.get(i);
			JSONObject job=(JSONObject)obj.get("Patient");
			String name=(String)job.get("name");
			String mobile=(String)job.get("mobile");
			String id=(String)job.get("id");
			String age=(String)job.get("age");
			System.out.print(name+" ");
			System.out.print(mobile+"  ");
			System.out.print(id+"  ");
			System.out.print(age+"  ");
			System.out.println();
			System.out.println();
		}
	}
	void SearchPatient() throws IOException, ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of patient");
		String str=sc.next();
		FileReader fr=new FileReader("Patient.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray Jsarr=(JSONArray)ob;
		JSONObject obj;
		for(int i=0;i<Jsarr.size();i++) {
			obj=(JSONObject)Jsarr.get(i);
			JSONObject job=(JSONObject)obj.get("Patient");
			String id=(String)job.get("id");
			if(str.equals(id)) {
				System.out.println("Name"+" "+"mobile"+"    "+"id"+"   "+"age");
				String name=(String)job.get("name");
				String mobile=(String)job.get("mobile");
				String id1=(String)job.get("id");
				String age=(String)job.get("age");
				System.out.print(name+" ");
				System.out.print(mobile+"  ");
				System.out.print(id1+"  ");
				System.out.print(age+"  ");
				System.out.println();
				System.out.println();
			}
			
	}
	
    
}
}
