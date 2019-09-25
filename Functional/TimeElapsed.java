package Utility;
import java.util.*;
class StopWatch{
	long Start=0;
	long end=0;
	long total=0;
	public final void start() {
		Start=System.currentTimeMillis();
	}
	public final void stop() {
		end=System.currentTimeMillis();
	}
	public void totalTime() {
		total=end-Start;
		//System.out.println(total);
		System.out.println(total/1000);
	}
}

public class TimeElapsed {
	public static void main(String args[]) {
		StopWatch st=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any digit to start the stop watch");
		int n1=sc.nextInt();
		st.start();
		System.out.println("enter any digit to end the stop watch");
		int n2=sc.nextInt();
		
		st.stop();
		System.out.println("Total Time in Sec");
		st.totalTime();
		
	}
	

}
