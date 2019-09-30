package Utility;

import java.util.*;
class PrimeAnagram2D{
	int arr[][]=new int[10][];
	int counter=0,s=0;
	int j=0;
	ArrayList<Integer> ls=new ArrayList<Integer>();
	void find(int num1,int num2) {
		for(int i=num1;i<=num2;i++) {
			if(s>=100) {
				arr[j]=new int[counter];
				j++;
				s=0;
				counter=0;
			}
			if(Util.isPrime(i)) {
				ls.add(i);
				counter++;
	       }
			s++;
        }
		//System.out.print(ls+" ");
		//primeAnagram(ls);
		
   
	}
	void show() {
		int c=0;
		int i=0;
		int j=0;
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr[i].length;j++) {
				arr[i][j]=ls.get(c);
				c++; 
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

public class Prime2DArray {

	public static void main(String[] args) {
		PrimeAnagram2D obj=new PrimeAnagram2D();
		obj.find(0,1000);
		obj.show();
	} 	

}
