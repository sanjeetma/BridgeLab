import java.util.*;
class Count{
	long fact(int n) {
		long fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
}
public class CountTrees {

	public static void main(String[] args) {
		Count obj=new Count();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Test case");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter no");
		for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {          //formula  (2n)! / ((n + 1)! * n!)
			int n=arr[i];
		long  real=obj.fact(n);
		long  doublen=obj.fact(2*n);
		long onemore=obj.fact(n+1);
		long divide=real*onemore;
	    long count=doublen/divide;
	    System.out.print("Number of trees of  " +n+" "+ "node:---->");
		System.out.println(count);
		}
	}

}
