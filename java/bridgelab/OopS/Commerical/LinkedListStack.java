package com.java.bridgelab.oops.Commerical;
	class NodeStack{
		 String company;
		 double data;
		 NodeStack next;
		 NodeStack(String company,double data){
			 this.company=company;
			 this.data=data;
		 }
	}
	public class LinkedListStack {
	      NodeStack top;
	      int size=0;
	      
	      void push(String symbol,double data) {
	    	  NodeStack node=new NodeStack(symbol,data);
	    	  if(top==null) {
	    		  top=node;
	    		  size++;
	    	  }
	    	  else {
	    		  node.next=top;
	    		  top=node;
	    		  size++;
	    	  }
	      }
	      void pop() {
	    	  NodeStack temp=top;
	    	  temp=temp.next;
	    	  top=temp;
	    	  size--;
	    	  
	      }
	      void display() {
	    	  NodeStack temp=top;
	    	  for(int i=0;i<size;i++) {
	    		  System.out.print("|"+temp.company+"| "+temp.data+"|-->");
	    		  temp=temp.next;
	    	  }
	      }
	}


