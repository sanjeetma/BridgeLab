package com.java.bridgelab.oops.addressview;


import java.io.FileNotFoundException;

import com.java.bridgelab.oops.Commerical.Util;
import com.java.bridgelab.oops.address.serviceimplements.FactoryAddress;
import com.java.bridgelab.oops.addressmodel.Address;

public class AddressMain {

	
	public static void main(String args[]) throws FileNotFoundException {
		Address obj=FactoryAddress. getObject();
		
		
		int choice;
		do {
			System.out.println("press 1: for add new Address");
			System.out.println("press 2: for update Address");
			System.out.println("press 3: for delete Address");
			System.out.println("press 4: for search Address");
			System.out.println("press 5: to exit");
		 choice=Util.intInput();
			switch(choice) {
			case 1:
				obj.add();
				break;
			case 2:
				obj.update();
				break;
			case 3:
				obj.delete();
				break;
			case 4:
				obj.search();
				break;
			case 5:
				System.out.println("good bye");
				break;
				
				
				
			}
			
		}while(choice<6);
		
	
	}
}
