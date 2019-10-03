package com.java.bridgelab.dataStructure;
import java.util.*;

import java.util.Arrays;

import org.json.simple.JSONObject;

public class Util {
	public static int binarySearch(String str, String arr[]) { //Binary Search for String
	/*Binary Search for String*/
		bubbleSort(arr);
		 int low=0;
		 int val = 0;
	        int high=arr.length;
	        while(low<=high){
	            int mid=(low+high)/2;
	            int res=str.compareTo(arr[mid]);
	            if(res==0){
	                //System.out.println(mid);
	            	val=mid;
	            }
	            if(res>0){
	                low=mid+1;
	            }
	            else{
	                high=mid-1;
	            }
	        }
	        
	       return val+1; 
	    }
	/*Binary search for Integer*/
	public static int binarySearch(int a,int arr[]) {
		//Binary Search Integer
		bubbleSort(arr);
		 int low=0;
		 int val = 0;
		 int res=a;
	        int high=arr.length;
	        while(low<=high){
	            int mid=(low+high)/2;

	            if(arr[mid]==a){
	                //System.out.println(mid);
	            	val=mid;
	            }
	            if(res>mid){
	                low=mid+1;
	            }
	            else{
	                high=mid-1;
	            }
	            
	        }
	        
	        return val+1; 
         }
	/*Bubble Sort for String*/
	
	public static void bubbleSort(String arr[]) {  //bubble sort string 

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
	}
	/*Bubble sort for Integer*/
	public static void bubbleSort(int arr[]) {
		  for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]>(arr[j])){
	                   int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
		}
	/*Insertion Sort For Integer*/
	public static void insertionInteger(int arr[]) {
		int n = arr.length;
		int key=0;
        for (int i = 0; i < n; i++) { 
             key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j]>key) { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j + 1] = key; 
	}
	}
	/*Insertion sort for string*/
	public static void insertionString(String arr[]) {
		int n = arr.length;
		//String key="";
        for (int i = 1; i < n; i++) { 
             String key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j].compareTo(key)>0) { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j + 1] = key; 
	}
	}
	/*Palindrome for String*/
	public static boolean pallindrom(String str1) {
		String rev=null;
		boolean bool=false;
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev + str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(rev)) {
		    bool = true;
		}
	
		
		
	return bool;
		
	}
	/* for Integer Pallindrome*/
	public static boolean isPallindromeInteger(int num1) {
		int rev=0;
		int temp=num1;
		boolean bool=false;
		while(num1!=0) {
			int rem=num1%10;
		   num1=num1/10;
		   rev=(rev*10)+rem;
		}
		if(temp==rev) {
			bool=true;
		}
		return bool;
	}
	/*Check whether Number Is Prime Or Not*/
	public static boolean isPrime(int n) {
		int count =0;
		boolean val=false;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1) {
			val=true;
		}
		return val;
	}
	/*Anagram for  String*/
	public static boolean isAnagram(String str1,String str2) {
		boolean bool=false;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String str3=new String(ch1);
		String str4=new String(ch2);
		if(str3.equals(str4)){
			bool=true;
		}
		return bool;
	}
	/*Anagram for digit*/
	public static boolean isAnagramDigit(int num1,int num2) {
		int counter=0;
		boolean bool=false;
		ArrayList<Integer>list=new ArrayList<Integer>();
		ArrayList<Integer>list1=new ArrayList<Integer>();
		while(num1!=0) {
			int n1=num1%10;
			list.add(n1);
			num1=num1/10;
		}
		while(num2!=0) {
			int n2=num2%10;
			list1.add(n2);
			num2=num2/10;
		}
		Collections.sort(list);
		Collections.sort(list1);
		if(list.size()==list1.size()) {
		for(int i=0;i<list.size();i++) {
			if((int)list.get(i)==(int)list1.get(i)) {
				counter++;
			}
		}
		if(counter==list.size()) {
			bool=true;
		}
		
		
	}
		return bool;
	}
		/*Conversion Celsius to Fahrenheit:*/	
	public static float Fahrenheit(int num1) {     // (°C × 9/5) + 32 = °F
			float num2=(num1*9/5)+32;
	
		return num2;
	}
	
	/*Conversion Fahrenheit to Celsius*/
	public static float Celsius(int num1) {    //(°F − 32) x 5/9 = °C

		float num2=(num1-32)*5/9;
		return num2;
		
	}
	public static int dayOfWeek(int month,int day,int year) {
		int y=year;
		int m=month;
		int d=day;
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=(m+12*((14-m)/12))-2;
		int d0=(d+x+(31*m0)/12)%7;
				
	   return d0;
	}
	public static double monthlyPayment(double Y,double P,double R) {
		double payment;
		double n=12*Y;
		double r=R/(12*100);
		double temp=Math.pow((1+r), -n);
		payment=(P*r)/1-temp;
		return payment;
		
	}
}
   
	
	
		
	
	
	



