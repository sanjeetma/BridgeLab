package com.java.bridgelab.dataStructure;
class SNode{
	char data;
	SNode next;
	SNode(char data){
		this.data=data;
	}

}
class LinkedStack{
	SNode top;
	int size=0;
	
	void push(char data) {
		SNode n1=new SNode(data);
		if(top==null) {
			top=n1;
			size++;
		}
		else {
			n1.next=top;
			top=n1;
			size++;
		}
		
	}
	void pop() {
		top=top.next;
		size--;
	}
	void display() {
		SNode temp=top;
		for(int i=0;i<size;i++) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void Check(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(') {
				push(ch[i]);
			}
			if(ch[i]==')') {
				pop();
			}
		}
	}
	void show() {
		if(top==null) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

public class BalancePara {
	public static void main(String args[]) {
	LinkedStack obj=new LinkedStack();
	String str="(((((5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
	obj.Check(str);
	obj.show();
	obj.display();
	}
	

}
