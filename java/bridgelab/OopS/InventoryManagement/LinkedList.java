package com.java.bridgelab.OopS.InventoryManagement;
class Node{
	String str;
	double data;
	Node next;
	Node(String str,double data){
		this.data=data;
		this.str=str;
	}
}
public class LinkedList {
	Node start;
	int size;
	
	void addAtFirst(String str,double data) {
		Node node=new Node(str,data);
		if(start==null) {
			start=node;
			size++;
		}
		else {
			node.next=start;
			start=node;
			size++;
		}
	}
	void display() {
		Node temp=start;
		for(int i=0;i<size;i++) {
			System.out.print(temp.str+"| "+temp.data+"---->");
			temp=temp.next;
		}
	}

}
