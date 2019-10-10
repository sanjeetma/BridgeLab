package com.java.bridgelab.DesignPattern.Singleton;

public class BillPugh {
       private BillPugh() {}
      private  static   class Helper{
    	   private static final BillPugh obj=new BillPugh(); 
       }
      public static BillPugh getObject() {
    	  return Helper.obj;
      }
      
}
