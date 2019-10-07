package com.java.bridgelab.oops;

class Node{
	String data;
	Node next;
	Node(String data){
		this.data=data;
	}
}
public class LinkedListQue {
	static Node front;
	static int size=0;
	static Node rear;
	
	
	public static void enqueue(String data) {
		
		Node n=new Node(data);
		if(front==null) {
			front=n;
			rear=n;
			size++;
		}
		else {
			rear.next=n;
			rear=n;
			size++;
			
		}
	}
	 public static void dequeue() {
		front=front.next;
		size--;
	}
	
	void display() {
		Node temp=front;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
     
}
