import java.util.*;
import Utitlity.*;
class Quadratic{
    void root(int a,int b,int c){
        int d=((b*b)-4*a*c);
        double root1=(-b+(Math.sqrt(d)))/2*a;
        double root2=(-b-(Math.sqrt(d)))/2*a;
       System.out.println(root1+","+root2);
    }
}
class Main{
    public static void main(String args[]){
       System.out.println("Enter a , b, c");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       Quadratic obj=new Quadratic();
       obj.root(a,b,c);
       int n=Utitlity.add(2,3);
       System.out.println(n);
    }
}