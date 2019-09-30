import java.util.*;
class VendingMachine{
	int Total=0;
	int arr[]= {1,2,5,10,50,100,500,1000};
	int sum=0;
	int i=0;
	 void check(int n) {
		 if(n!=0)
	      for(int i=0;i<arr.length;i++) {
	    	  if(n<arr[i]) {
	    		  divide(n,arr[i-1]);
	    		  break;
	    	  }
	      }
		 if(n>1000) {
			 divide(n,1000);
		 }
	}
		
	
	void divide(int note,int nearValue) {
		if(note!=0) {
		int sum=0;
		 sum=sum+note/nearValue;
		 Total=Total+sum;
		 int num=note%nearValue;
		 System.out.println(nearValue+"-->"+sum);
		 check(num);
		 }
	}
	void show() {
		System.out.println("Total note="+Total);
	}
}
public class Vending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter note");
		int note=sc.nextInt();
		VendingMachine obj=new VendingMachine();
		obj.check(note);
		obj.show();
		
		

	}

}
