package com.java.bridgelab.oops.Commerical;
class NodeShare{
	 String company;
	 double data;
	 NodeShare next;
	 NodeShare(String company,double data){
		 this.company=company;
		 this.data=data;
	 }
}
public class LinkedListShare {
      NodeShare start;
      int size=0;
      
      void addAtFirst(String symbol,double data) {
    	  NodeShare node=new NodeShare(symbol,data);
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
    	  NodeShare temp=start;
    	  for(int i=0;i<size;i++) {
    		  System.out.print("|"+temp.company+"| "+temp.data+"|-->");
    		  temp=temp.next;
    	  }
      }
}
