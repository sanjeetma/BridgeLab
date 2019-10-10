package com.java.bridgelab.DesignPattern.Singleton;

public class ThreadSafe {
         private static ThreadSafe obj;
         
         private ThreadSafe(){}
            
         
         public static synchronized ThreadSafe getObject() {       ///static lock the  class
        	                                                       // synchronized lock the object
        	 if(obj==null) {
        		 obj=new ThreadSafe();
        	 }
        	 return obj;
         }
}
