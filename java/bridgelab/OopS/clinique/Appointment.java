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

public class Appointment {
       String id;
       String docname;
       String pname;
       String time;
       String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	void createNewAppointment() throws IOException, ParseException {
		JSONArray jsarr=new JSONArray();
		FileReader fr=new FileReader("Appointment.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray arr=(JSONArray)ob;
		JSONObject obj;
		for(int i=0;i<arr.size();i++) {
			obj=(JSONObject)arr.get(i);
			jsarr.add(obj);
		}
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String pname=sc.next();
		setPname(pname);
		System.out.println("Enter doctor name");
		String dname=sc.next();
		setDocname(dname);
		System.out.println("Enter id");
		String id=sc.next();
		setId(id);
		System.out.println("Enter timing");
		String time=sc.next();
		setTime(time);
		
		System.out.println("Enter date of format dd/MM/YYYY");
		String date=sc.next();
		setDate(date);
		
		FileWriter fw=new FileWriter("Appointment.json");
		JSONObject obj1=new JSONObject();
		obj1.put("Pname",getPname());
		obj1.put("id", getId());
		obj1.put("dname",getDocname());
		obj1.put("time", getTime());
		obj1.put("date", getDate());
		JSONObject obj2=new JSONObject();
		obj2.put("Patient",obj1);
		jsarr.add(obj2);
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
	}
	
	
	
     
	void takeNewAppointFile() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String pname=sc.next();
		setPname(pname);
		System.out.println("Enter doctor name");
		String dname=sc.next();
		setDocname(dname);
		System.out.println("Enter id");
		String id=sc.next();
		setId(id);
		System.out.println("Enter timing");
		String time=sc.next();
		setTime(time);
		System.out.println("Enter date of format dd/MM/YYYY");
		String date=sc.next();
		setDate(date);
		
		FileWriter fw=new FileWriter("Appointment.json");
		JSONArray jsarr=new JSONArray();
		JSONObject obj=new JSONObject();
		obj.put("Pname",getPname());
		obj.put("id", getId());
		obj.put("dname",getDocname());
		obj.put("time", getTime());
		obj.put("date", getDate());
		JSONObject obj1=new JSONObject();
		obj1.put("Patient",obj);
		jsarr.add(obj1);
		
		fw.write(jsarr.toJSONString());
		fw.flush();
		fw.close();
		
	}
	void read() throws IOException, ParseException {
		FileReader fr=new FileReader("Appointment.json");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(fr);
		JSONArray Jsarr=(JSONArray)ob;
		JSONObject obj;
		System.out.println("PName"+" "+"Docname"+"    "+"id"+"   "+"timing"+" "+"date");
		System.out.println();
		for(int i=0;i<Jsarr.size();i++) {
			obj=(JSONObject)Jsarr.get(i);
			JSONObject job=(JSONObject)obj.get("Patient");
			String Pname=(String)job.get("Pname");
			String dname=(String)job.get("dname");
			String id=(String)job.get("id");
			String timing=(String)job.get("time");
			String date=(String)job.get("date");
			System.out.print(Pname+" ");
			System.out.print(dname+"  ");
			System.out.print(id+"  ");
			System.out.print(timing+"  ");
			System.out.print(date+"  ");
			System.out.println();
			System.out.println();
		}
	}
}
