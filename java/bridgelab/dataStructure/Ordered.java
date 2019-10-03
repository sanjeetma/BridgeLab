package com.java.bridgelab.dataStructure;

import java.util.*;
import java.io.*;
import Utility.*;
class IntNode<T>{
	
	T data;
      IntNode<T> next;
	IntNode(T data){
		this.data=data;
	}
}
class LinkedInt<T>{
	IntNode start;
	int size;
void addAtFirst(T data) {
	IntNode<Integer> n1=new IntNode(data);
	if(start==null) {
		start=n1;
		size++;
	}
	else {
		n1.next=start;
		start=n1;
		size++;
	}
}
void deleteAtStart() {
	IntNode temp=start;
	temp=temp.next;
	start=temp;
	size--;
}
void deleteAtpos(int pos) {
	if(pos==0) {
	deleteAtStart();	
	}
	else {
	IntNode temp=start;
	for(int i=0;i<pos-1;i++) {
		temp=temp.next;
		
	}
	temp.next=temp.next.next;
	size--;
	}
	
}
void display() {
	IntNode temp=start;
	for(int i=0;i<size;i++) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
	printReverse(start);
	
}
void printReverse(IntNode start) 
{ 
    if (start == null) 
    	return; 

    // print list of head node 
    printReverse(start.next); 

    // After everything else is printed 
    System.out.print(start.data +" "); 
} 
public boolean search(int n) {
	boolean bool=false;
    IntNode temp=start;
    for(int i=0;i<size;i++) {
    	if(temp.data==(Integer)n) {
    		System.out.println("found at"+i);
    		deleteAtpos(i);
    		bool=true;
    		break;
    	}
    	temp=temp.next;
    }
    return bool;
}
void foundAndAdd(int  n) throws Exception {
     IntNode temp=start;
	if(!search(n)) {
		FileWriter writer = new FileWriter("/home/admin1/Desktop/output.txt",true);  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write(" "+n); 
	    addAtFirst(Integer(n));
	    System.out.println("Added Suceesfully");
	    buffer.flush();
	    buffer.close();
	}
	else {
		ArrayList<Integer> ls =new ArrayList<Integer>();
		IntNode temp1=start;
		FileWriter fl=new FileWriter("/home/admin1/Desktop/output.txt");
		BufferedWriter buffer = new BufferedWriter(fl);
        fl.write("");
        System.out.println("The value  was succesfully written to a file");

		for(int i=0;i<size;i++) {
			buffer.write(" "+temp.data);
			temp=temp.next;
		}
		buffer.flush();
		 buffer.close();
	}
	
}
private T Integer(int n) {
	return null;
}
	
}
public class Ordered {

	public static void main(String[] args) throws Exception {
		LinkedInt <Integer>obj=new LinkedInt<Integer>();
		ArrayList<Integer>list=new ArrayList<Integer>();
	File file=new File("/home/admin1/Desktop/output.txt");
	Scanner sc=new Scanner(file);
	while(sc.hasNext()) {
		list.add(sc.nextInt());
		//obj.addAtFirst(Integer.parseInt(sc.next()));
		
	}
	Collections.sort(list);
	for(int i=0;i<list.size();i++) {
		int number=list.get(i);
	  obj.addAtFirst(number);
	}
	obj.display();
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter number to search");
	Integer num= sc1.nextInt();
	obj.foundAndAdd(num);
	obj.display();

	}

}
