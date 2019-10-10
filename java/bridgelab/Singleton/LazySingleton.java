package com.java.bridgelab.DesignPattern.Singleton;

public class LazySingleton {
             private static LazySingleton obj;
             
             private LazySingleton() {}
             
             public static LazySingleton getObject() {
            	 if(obj==null) {
            		 obj=new LazySingleton();
            	 }
            	 return obj;
             }
}
