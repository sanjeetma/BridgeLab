package com.java.bridgelab.oops.address.serviceimplements;

import com.java.bridgelab.oops.addressmodel.Address;

public class FactoryAddress {
     public static Address getObject() {
    	 return new AddressBook();
     }
}
