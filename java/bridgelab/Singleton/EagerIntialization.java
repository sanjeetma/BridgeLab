package com.java.bridgelab.DesignPattern.Singleton;

public class EagerIntialization {
      private static EagerIntialization obj=new EagerIntialization();
      private EagerIntialization() {}
      
      
      public static EagerIntialization getEagerIntialization() {     //public factory Method
    	  return obj;
    	  
      }
      
      
}

