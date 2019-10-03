package com.java.bridgelab.dataStructure;
import java.util.*;
class DqNode{
    char data;
    DqNode next;
    DqNode prev;
    DqNode(char data){
        this.data=data;
    }

}
class Dequeue{
    DqNode head;
    DqNode tail;
    char size;
    void addFront(char data){
        DqNode n1=new DqNode(data);
  if(head == null) {   
            head=n1;
            tail=n1;
            size++; 
        }  
        else { 
            n1.next=head;
            head.prev=n1;
            head=n1;
            n1.prev=null;
            size++;  
        }  
    }
    void addRear(char data){
        DqNode n1=new DqNode(data);
         n1.next=null;
         n1.prev=tail;
         tail.next=n1;
         tail=n1;
         size++;

        
}
void removeAtFirst(){
    head=head.next;
    head.prev=null;
    size--;
}
void removeAtLast(){
    tail=tail.prev;
    size--;
}
  void check(String str) {
	 String rev="";
	while(head!=null){
	
	rev=rev+head.data;
	head=head.next;
	//removeAtLast();
	}
	System.out.println(rev);
	if(rev.equals(str)) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("Not Pallindrome");
	}
	
}
    void print(){
        DqNode temp=head;
        for(char i=0;i<size;i++){
            //System.out.prcharln(temp);
            System.out.print(temp.data+"-->");
            //System.out.prcharln(temp.next);
            //System.out.prcharln(temp.prev);
            temp=temp.next;
        }
}
}
public  class PallindromeCheck {
	

    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	 Dequeue obj=new  Dequeue();
	char ch[]=str.toCharArray();
	for(char i=0;i<ch.length;i++) {
		obj.addFront(ch[i]);
	}
	
	obj.print();
	obj.check(str);
   
}
    }


