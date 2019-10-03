package com.java.bridgelab.functional;
import java.util.*;
class Quad{
    void root(int a,int b,int c){
        int d=((b*b)-4*a*c);
        double root1=(-b+(Math.sqrt(d)))/2*a;
        double root2=(-b-(Math.sqrt(d)))/2*a;
       System.out.println(root1+","+root2);
    }
}
class Quadratic{
    public static void main(String args[]){
       System.out.println("Enter a , b, c");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       Quad obj=new Quad();
       obj.root(a,b,c);
      
    }
}