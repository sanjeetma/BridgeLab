package com.java.bridgelab.functional;

import java.util.*;
class Codistance{
    double distance(int x,int y){
        double n1=Math.pow(x,2);
        double n2=Math.pow(y,2);
        double sum=n1+n2;
        Double res=Math.sqrt(sum);
        return res;
    }
}
class Main{
    public static void main(String args[]){
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        Codistance obj=new Codistance();
        double val=obj.distance(x,y);
        System.out.println(val);
        Codistance obj1 = new Codistance();
        System.out.println(obj1);
    }
}