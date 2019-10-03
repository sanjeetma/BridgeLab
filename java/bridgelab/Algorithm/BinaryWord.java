package com.java.bridgelab.Algorithm;
import java.util.*;
import java.io.*;
class ReadFile{
	 int num;
	    void readFile() throws Exception{
	        ArrayList<String>arr=new ArrayList<String>();
	        File file=new File("/home/admin1/Desktop/test");
	        Scanner sc=new Scanner(file);
	        Scanner sc1=new Scanner(System.in);
	        System.out.println("enter String");
	        String str =sc1.nextLine();
	        while(sc.hasNext()){
	            arr.add(sc.next());
	        }
	        String arr1[]=new String[arr.size()];
	        for(int i=0;i<arr.size();i++){
	              arr1[i]=arr.get(i);
	        }
	        Arrays.sort(arr1);
	        for(int i=0;i<arr1.length;i++){
	            System.out.print(arr1[i]+" ");
	        }
	        System.out.println();
	        searchString(str,arr1);
	        //System.out.println("found at"+n);
	    }
	    void searchString(String str,String arr1[]){
	    	int found=Util.binarySearch(str, arr1);
	    	System.out.println("String Found at="+found);
	    }
	    
}
public class BinaryWord {

	public static void main(String[] args) throws Exception{
		 ReadFile obj=new ReadFile();
	       obj.readFile();
	}

}
