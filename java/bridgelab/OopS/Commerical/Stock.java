/**
 * 
 */
package com.java.bridgelab.oops.Commerical;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

/**
 * @author sanje
 *
 */
public interface Stock {
          void stockaccount(String file) throws IOException, ParseException;
          double valueOf() throws IOException, ParseException;
          void buy(int amount,String symbol) throws IOException, ParseException;
          void sell(int amount,String symbol) throws IOException, ParseException;
          void save(String filename);
          void printReport() throws FileNotFoundException, IOException, ParseException;
         
}
