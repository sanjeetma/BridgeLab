package com.java.bridgelab.oops.address.serviceimplements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.java.bridgelab.oops.Commerical.Util;
import com.java.bridgelab.oops.addressmodel.Address;

public class AddressBook implements Address {

	@Override
	public void add() throws FileNotFoundException {

		JSONArray jarr = new JSONArray();
		FileReader fr = new FileReader("Address.json");
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(fr);
			JSONArray arr = (JSONArray) ob;
			JSONObject obj;
			for (int i = 0; i < arr.size(); i++) {
				obj = (JSONObject) arr.get(i);
				jarr.add(obj);
			}

		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		AddressInput obj = new AddressInput();
		System.out.println("Enter name");
		String name = Util.stringInput();
		obj.setName(name);
		System.out.println("Enter city");
		String city = Util.stringInput();
		obj.setCity(city);
		System.out.println("Enter zip");
		String zip = Util.stringInput();
		obj.setZip(zip);
		System.out.println("Enter mobile number");
		String mobile = Util.stringInput();
		obj.setMobile(mobile);

		JSONObject job = new JSONObject();
		job.put("name", name);
		job.put("city", city);
		job.put("zip", zip);
		job.put("mobile", mobile);

		jarr.add(job);
		System.out.println("added succesfully");
		Util.writeJsonFile(jarr);

	}

	@Override
	public void update() throws FileNotFoundException {
		
		
		System.out.println("Enter name");
		String name1 = Util.stringInput();
		JSONArray jarr = new JSONArray();
		FileReader fr = new FileReader("Address.json");
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(fr);
			JSONArray arr = (JSONArray) ob;
			JSONObject obj;
			for (int i = 0; i < arr.size(); i++) {
				obj = (JSONObject) arr.get(i);
				String name = (String) obj.get("name");
				if (!name1.equals(name))
					jarr.add(obj);
			}

		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		AddressInput obj = new AddressInput();
		System.out.println("Enter name");
		String name = Util.stringInput();
		obj.setName(name);
		System.out.println("Enter city");
		String city = Util.stringInput();
		obj.setCity(city);
		System.out.println("Enter zip");
		String zip = Util.stringInput();
		obj.setZip(zip);
		System.out.println("Enter mobile number");
		String mobile = Util.stringInput();
		obj.setMobile(mobile);

		JSONObject job = new JSONObject();
		job.put("name", name);
		job.put("city", city);
		job.put("zip", zip);
		job.put("mobile", mobile);

		jarr.add(job);
		System.out.println("updated succesfully");
		Util.writeJsonFile(jarr);

	}

	@Override
	public void delete() throws FileNotFoundException {
		
		System.out.println("Enter your name");
		String name = Util.stringInput();
		JSONArray jarr = new JSONArray();
		FileReader fr = new FileReader("Address.json");
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(fr);
			JSONArray arr = (JSONArray) ob;
			JSONObject obj;
			for (int i = 0; i < arr.size(); i++) {
				obj = (JSONObject) arr.get(i);
				String name1 = (String) obj.get("name");
				if (!name1.equals(name))
					jarr.add(obj);
			}

		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		System.out.println("deleted Succesfully");
		Util.writeJsonFile(jarr);

	}

	@Override
	public void search() throws FileNotFoundException {

		System.out.println("Enter name");
		String name = Util.stringInput();
		FileReader fr = new FileReader("Address.json");
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(fr);
			JSONArray arr = (JSONArray) ob;
			JSONObject obj;
			for (int i = 0; i < arr.size(); i++) {
				obj = (JSONObject) arr.get(i);
				String name1 = (String) obj.get("name");
				if (name1.equals(name)) {
					System.out.println(name1);
					System.out.println((String) obj.get("city"));
					System.out.println((String) obj.get("zip"));
					System.out.println((String) obj.get("mobile"));
				}
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}

}
