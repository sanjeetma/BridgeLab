package com.java.bridgelab.Algorithm;
import java.util.*;
class Check{
	void printPrime(int n1,int n2)
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++) {
			if(Util.isPrime(i)) {
				System.out.print(i+" ");
				list.add(i);
			}
		}
		System.out.println();
		printPallindromeDigit(list);
		printAnagram(list);
		//System.out.println(list);
	}
	void printPallindromeDigit(ArrayList<Integer>list) {
		for(int i=0;i<list.size();i++) {
			if(Util.isPallindromeInteger(list.get(i))) {
				System.out.print(list.get(i)+" ");
			}
		}
	}
	void printAnagram(ArrayList<Integer>list) {
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(Util.isAnagramDigit(list.get(i),list.get(j))) {
					System.out.print("Anagram of"+list.get(i)+" "+list.get(j)+ ""+"\n");
				}
			}
			System.out.println();
		}
	}
}
public class AnagramPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check obj=new Check();
		obj.printPrime(0, 1000);
	}

}
