package com.java.bridgelab.DesignPattern.Singleton;

public class StatiBlockInitialization {
            private static StatiBlockInitialization obj;
            private StatiBlockInitialization() {
			
			}
            static {
            	try {
            		obj=new StatiBlockInitialization();
            	}
            	catch(Exception e) {
            		 throw new RuntimeException("Exception occured in creating singleton instance");
            	}
            }
            public static StatiBlockInitialization getObject() {
            	return obj;
            }
}
