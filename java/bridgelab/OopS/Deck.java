package com.java.bridgelab.oops;

import java.util.Random;

public class Deck {
	static void init(String[] s,String r[]) {
		int m=0;
		String deck[]=new String[s.length*r.length];
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<s.length;j++) {
				deck[m]=r[i]+" "+s[j];
				m++;
			}
		}
		System.out.println(deck.length);
		suffle(deck);
		
	}
	
	static void suffle(String ar[]) {
		String suffle[][]=new String[4][9];
		Random random=new Random();
		//int r=random.nextInt(52);
		//System.out.println(r);
		for(int i=0;i<suffle.length;i++) {
			for(int j=0;j<suffle[i].length;j++) {
				int r=random.nextInt(52);
				suffle[i][j]=ar[r];
				
			}
			
		}
		print(suffle);
		
	}
	static void print(String ar[][]) {
		int m=1;
		for(int i=0;i<ar.length;i++) {
			System.out.println("card  of   Player=="+m);
			LinkedListQue.enqueue("Player="+m);
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j]!=null)
					System.out.println(ar[i][j]);
			     LinkedListQue.enqueue(ar[i][j]);
			
			}
			
			
			m++;
		}
	}
	

	public static void main(String[] args) {
		LinkedListQue obj=new LinkedListQue();
		obj.display();
		String suit[]= {"Clubs","Diamonds","Hearts","Spades"};
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String deck[]=new String[suit.length*rank.length];
	     init(suit,rank);
	     obj.display();
	}

}
