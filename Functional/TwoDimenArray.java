package Utility;
import java.util.*;
import java.io.*;
class Matrix{
	void inputMatrix(int row,int column) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element of matrix");
		int mat[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		display(mat,row,column);
		
	}
	
	void display(int a[][],int row,int column) {
		OutputStreamWriter op=new OutputStreamWriter(System.out);
		PrintWriter ptr=new PrintWriter(op);
		System.out.println("Matrix are:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				int num=a[i][j];
			ptr.write(num+" ");
			ptr.flush();
			}
		        ptr.println();
		}
	}
	
}

public class TwoDimenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Of Matrix");
		int row=sc.nextInt();
		System.out.println("Enter Column Of Matrix");
		int column=sc.nextInt();
		Matrix mt=new Matrix();
		mt.inputMatrix(row,column);
	}

}
