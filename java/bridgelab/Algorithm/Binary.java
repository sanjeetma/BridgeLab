
package com.java.bridgelab.Algorithm;
import java.util.*;
class Test{
	void toBinary(int num) {
		int arr[]=new int[8];
		int n=arr.length;
		while(num>0) {
			int rem=num%2;
			arr[n-1]=rem;
			num=num/2;
			n--;
			
		}
		display(arr);
		toDigit(arr);
		swapNibble(arr);
	}
	void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	void toDigit(int arr[]) {
		System.out.println();
		double sum=0;
		int m=0;
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
		int val=arr[i];
		double res= val*Math.pow(2, m);
		sum=sum+res;
		m++;
		}
		System.out.println(sum);
	}
	void swapNibble(int arr[]) {
		int n=arr.length;
		int n1=n/2;
		int k=0;
		int arr1[]=new int[n/2];
		int arr2[]=new int[n/2];
		int arr3[]=new int[n];
		for(int i=0;i<n/2;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<n/2;i++) {
			arr2[i]=arr[n1];
			n1++;
		}
		for(int i=0;i<n/2;i++) {
			arr3[i]=arr2[i];
		}
		for(int i=n/2;i<n;i++) {
			arr3[i]=arr1[k];
		     k++;
		    
		}
		toDigit(arr3);
		
	}

	
}

public class Binary {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test obj=new Test();
        obj.toBinary(100);
	}

}
