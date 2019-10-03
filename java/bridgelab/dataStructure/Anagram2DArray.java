package com.java.bridgelab.dataStructure;
import java.util.*;
import com.java.bridgelab.Algorithm.Util;

class Anagram{
	int arr[][]=new int[20][];
	ArrayList<Integer> list=new ArrayList<Integer>();
	void FindAnagram(int num1,int num2) {
		int counter=0,count=0,k=0;
		for(int i=num1;i<num2;i++) {
			if(Util.isPrime(i)) {
				for(int j= i+1;j<num2;j++) 
				{
					if(count>=100) {
						count=0;
						arr[k]=new int[counter];
						counter=0;
						k++;
						}
					if(Utility.Util.isAnagramDigit(i,j)) {
						list.add(j);
						counter++;
					}
					
				}
				
			}
			count++;
		
		}
	}
	void store() {
		int c=0;
		int i=0;
		int j=0;
		System.out.print(list);
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr[i].length;j++) {
				arr[i][j]=list.get(c);
				c++;
			}
		}
		for(i=0;i<arr.length;i++ ) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Anagram2DArray {

	public static void main(String[] args) {
		Anagram obj=new Anagram();
		obj.FindAnagram(0, 1000);
		obj.store();
		

	}

}
