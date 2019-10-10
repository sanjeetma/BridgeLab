package com.java.bridgelab.OopS.InventoryManagement;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface Stock {
   void Stockaccount(String str) throws IOException;
   
   
   double valueOf() throws FileNotFoundException, IOException, ParseException;
   
   
   void buy(int amount,String symbol) throws FileNotFoundException, IOException, ParseException;
   
   
   void sell(int amount,String symbol) throws FileNotFoundException, IOException, ParseException;
   
   
   void save(String file);
   
   
   void print() throws FileNotFoundException, IOException, ParseException;
}
