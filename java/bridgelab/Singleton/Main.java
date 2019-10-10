package com.java.bridgelab.DesignPattern.Singleton;

import java.lang.reflect.Constructor;

public class Main{
	public static void main(String args[]) {
		//EagerIntialization obj=EagerIntialization.getEagerIntialization();
		EagerIntialization obj1=EagerIntialization.getEagerIntialization();
		EagerIntialization obj2=EagerIntialization.getEagerIntialization();
		EagerIntialization obj3=null;
		System.out.println(obj3);
		System.out.println(obj1);
		System.out.println(obj2);
		//EagerIntialization obj5=new EagerIntialization();
		try {
            Constructor[] constructors = EagerIntialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                obj3 = (EagerIntialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println(obj3);
		System.out.println(obj3);
		System.out.println(obj1);
		System.out.println(obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());
    }
	}
