package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> ls=new ArrayList<Integer>();
		File file=new File("\\C:\\Users\\sanje\\Desktop\\Integer.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextInt()) {
			ls.add(sc.nextInt());
		}
		int arr[]=new int[ls.size()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ls.get(i);
		}
		Util.insertionInteger(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
