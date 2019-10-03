package com.java.bridgelab.functional;
import java.util.*;

class Gamb{
	int win=0;
    int loss=0;
    void gambler(int Stake,int Goal,int Nos){
        //int i=0;
        //int Nos=0;
        while(Stake>0&&Stake<Goal&&Nos>=0){
            
             double res=Math.random();
            int n=(int)Math.round(res);
             if(n==0){
                 win++;
                 Stake=Stake+1;
             }
             else{
                 loss++;
                 Stake=Stake-1;
             }
             Nos--;
             
            }
            
            
        

        System.out.println(Stake);
        System.out.println("win="+win);
        System.out.println("loss="+loss);
       // System.out.println("number of time played="+Nos);
        percentage(win,loss,Nos);
    }
    void percentage(int win,int loss, int Nos){
        float gain=(float)win-loss;
        float los=(float)loss-win;
        float n=(float)Nos;
       if(win>loss){
        float res=(gain/n)*100;
        System.out.println(" win percentage is="+res);
       }
       else{
           float res1=(los/n)*100;
           System.out.println("loss percentage="+res1);
       }
       

    }

}
class Gambler{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter take Money");
     int Stake=sc.nextInt();
      System.out.println("enter goal Money");
     int Goal=sc.nextInt();
      System.out.println("enter no of times");
     int Nos=sc.nextInt();
     Gamb obj=new Gamb();
     obj.gambler(Stake,Goal,Nos);
    }
}