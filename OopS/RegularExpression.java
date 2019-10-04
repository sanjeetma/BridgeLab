package com.java.bridgelab.OopS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class  RegEx
{
	private String firstname;
	private String lastname;
	private String fullname;
	private String mobile;
	private Date date;
	public String getFirstname() {
		return firstname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	void validationPhone(String mob) {
		 Pattern p = Pattern.compile("[7-9][0-9]{9}"); 
         Matcher m = p.matcher(mob);
         if(m.find()) {
         setMobile(mob);
         }
         }
         
	
	void validationString(String str1,String str2) {
		 Pattern p = Pattern.compile("^[a-zA-Z]*$"); 
         Matcher m = p.matcher(str1);
         Matcher m1 = p.matcher(str2);
         if(m.find()&&m1.find()) {
        	 setFirstname(str1);
        	 setLastname(str2);
         }
	}
	
	
	void FileReader() throws IOException {
		LocalDate d=java.time.LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	     // System.out.println(formatter.format(d));
		File file=new File("Text.txt");
		Scanner sc=new Scanner(file);
		String str="";
		while(sc.hasNextLine()) {
			 str=str+sc.nextLine();		
			}
		String str2=str.replace("<<name>>", getFirstname());
		str2=str2.replace("<<full name>>", getFullname());
		str2=str2.replace("xxxxxxxxxx", getMobile());
		str2=str2.replace("01/01/2016",formatter.format(d).toString());
		
		//System.out.println(str2);
		FileWriter fw=new FileWriter("Text1.txt");
		fw.write(str2);
		fw.flush();
		fw.close();
		File file1=new File("Text1.txt");
		Scanner sc1=new Scanner(file1);
		//String str="";
		while(sc1.hasNextLine()) {
			 System.out.println(sc1.nextLine());		
			}
		
		}
	

}




public class RegularExpression {

		
	public static void main(String[] args) throws FileNotFoundException {
		RegEx obj=new RegEx();
		try {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter first");
         String fn=sc.nextLine();
         System.out.println("last name");
         String ln=sc.nextLine();
         obj.validationString(fn, ln);
         System.out.println("Mobile number");
         String mob=sc.nextLine();
        obj.validationPhone(mob);
         String fullname=fn+" "+ln;
         obj.setFullname(fullname);
         obj.FileReader();
		}
		catch(Exception e) {
			System.out.println("enter valid information");
		}
         }

}
