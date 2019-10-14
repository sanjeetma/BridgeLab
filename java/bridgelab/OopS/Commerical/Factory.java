package com.java.bridgelab.oops.Commerical;

import com.java.bridgelab.oops.addressmodel.Address;

public class Factory {
public static Stock createObject() {
	return new ServiceImplementation();
}

}