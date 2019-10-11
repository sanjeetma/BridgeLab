package com.java.bridgelab.oops.Commerical;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Util {
           public static void readFile() throws IOException, ParseException {
        	   FileReader fr=new FileReader("Share.json");
        	   JSONParser parser=new JSONParser();
        	   Object ob=parser.parse(fr);
        	   
        	   
           }
}
