package Utility;
class Prime{
	int mat[][]=new int[10][100];
	void isPrime(int a,int b) {
		int k=0;
		int j=0,ct=0,s=0;
		System.out.print("[0-100]  ::");
		for(int i=0;i<=1000;i++) {
			if(Util.isPrime(i))
			{
				if(ct>=100) {
					s=s+100;
					System.out.print("\n["+s+"-"+(s+100)+"]::");
					ct=0;
				}
				System.out.print(i+" ");
				
			}
			ct++;
		}
	}
	void show() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<100;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class PrimeMatrix {

	public static void main(String[] args) {
		Prime obj=new Prime();
		obj.isPrime(2, 1000);
		//obj.show();
	
	}

}
