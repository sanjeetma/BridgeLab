package com.java.bridgelab.dataStructure;
import java.util.*;
class Customer{
	int data;
	Customer next;
	Customer(int data){
		this.data=data;
	}
}
class Counter{
	Customer front;
	Customer rear;
	int size;
	int Balance=0;;
	void enqueue(int data) {
		Customer n1=new Customer(data);
		if(front==null&&rear==null) {
			front=n1;
			rear=n1;
			size++;
		}
		else {
			Customer temp=rear;
	        temp.next=n1;
	        rear=n1;
	        size++;
		}
	}
	void dequeue() {
		Customer temp=front;
		temp=temp.next;
		front=temp;
		size--;
	}
	void deposit() {
			Balance=Balance+front.data;
			dequeue();
		
	}
	void withdraw() {
		Balance=Balance-front.data;
		dequeue();
	}
	void show() {
		if(Balance==0) {
		System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
		System.out.println(Balance);
	}
	void display() {
		Customer temp=front;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(rear.next);
	}
	
}

public class Banking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of pople");
		int n=sc.nextInt();
		Counter obj=new Counter();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter amount to deposit or withdraw");
			int n1=sc.nextInt();
			obj.enqueue(n1);
		}
		obj.display();
		for(int i=0;i<n;i++) {
			System.out.println("enter 1 for deposit");
			System.out.println("enter 2 for with draw");
			int n1=sc.nextInt();
			switch(n1)
			{
			 
			case 1:
				obj.deposit();
				break;
			case 2:
				obj.withdraw();
				break;
				default:
					System.out.println("not valid keys");
					break;
			}
			
		}
		     obj.show();
		     sc.close();
		     //obj.display();
		
		

    }
}

