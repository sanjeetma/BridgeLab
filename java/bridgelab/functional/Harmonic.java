package com.java.bridgelab.functional;
import java.util.*;
class A{
    public static void main(String args[]){
        float h1=1,h2=0;
        float sum=0;
        System.out.println("enter range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                sum=sum+h1/i; 
            }
            System.out.println(sum);
        
    }
}
