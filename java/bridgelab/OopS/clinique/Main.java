package com.java.bridgelab.OopS.clinique;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
	Doctors obj=new Doctors();
	Patient obj1=new Patient();
	Appointment obj3=new Appointment();
	Scanner sc=new Scanner(System.in);
	boolean ask=true;
	while(ask) {
	System.out.println("press 1:=looking for Doctor details");
	System.out.println("press 2:=looking for patient details");
	System.out.println("press 3:=looking for Appointment");
	System.out.println("press 4: to exit");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		obj.read();
		System.out.println("Press 1: to search availablity of doctor by id");
		System.out.println("Press 2: to add new doctor details");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			obj.checkAvail();
			break;
		case 2:
			obj.addAnotherDocDetails();
			break;
		}
	
		break;
	case 2:
		obj1.read();
		System.out.println("press 1: to search patient by id");
		System.out.println("press 2: add new patient record");
		int pat=sc.nextInt();
		switch(pat) {
		case 1:
			obj1.SearchPatient();
			break;
		case 2:
			obj1.addNewPatientRecord();
			break;
		}
		break;
	case 3:
		System.out.println("press 1: to see doctor details");
		System.out.println("press 2: take new Appointment");
		System.out.println("press 3: to see all Appontment Details");
		int app=sc.nextInt();
		switch(app) {
		case 1:
			obj.read();
			break;
		case 2:
			obj3.createNewAppointment();
			break;
		case 3:
			obj3.read();
			break;
		}
		break;
		default:
			ask=false;
			System.out.println("goodbye.....stay Healthy");
			break;
		
	}
	}
	}
	}


