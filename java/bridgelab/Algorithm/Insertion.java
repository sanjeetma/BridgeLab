package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Insertion {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> ls=new ArrayList<String>();
		File file=new File("\\C:\\Users\\sanje\\Desktop\\text.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			ls.add(sc.next());
		}
		String arr[]=new String[ls.size()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ls.get(i);
		}
      Util.insertionString(arr);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
