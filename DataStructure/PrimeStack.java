package Utility;

import java.util.*;
class NodeStack{
	int data;
	NodeStack next;
	NodeStack(int data){
		this.data=data;
		
	}
}
class StackLinked{
	NodeStack top;
	int size;
	
	void push(int data) {
		NodeStack node=new NodeStack(data);
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
	
	void pop(){
		top=top.next;
		size--;
	}
	
	void checkPrime(int num1,int num2) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=num1;i<num2;i++) {
			if(Util.isPrime(i)) {
				list.add(i);
			}
		}
		checkAnagram(list);
	}
	void checkAnagram(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(Util.isAnagramDigit(list.get(i), list.get(j))) {
					push(list.get(j));
				}
			}
		}
	}
	void display() {
		NodeStack temp=top;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		displayReverse(top);
	}
	void displayReverse(NodeStack node) {
		if(node==null) 
		return;
	   displayReverse(node.next);
	   System.out.print(node.data+"-->");
  }
}
public class PrimeStack {

	public static void main(String[] args) {
		StackLinked obj=new StackLinked();
		obj.checkPrime(0, 1000);
		obj.display();
	}

}