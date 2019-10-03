package com.java.bridgelab.Algorithm;
import java.util.*;
class FindSqrt{
	public static double sqrt(double c) {
		
		 double epsilon = 1e-15;
	        double t = c;             

	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	  
	        return t;
	        }

}

public class Sqrt {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double n=sc.nextDouble();
	double number=FindSqrt.sqrt(n);
	System.out.println(number);
	}

}
