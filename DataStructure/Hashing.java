import java.util.*;
import java.io.*;
class HNode<T>{
	T data;
	HNode next;
	HNode(T data){
		this.data=data;
	}
}
class HLinked<T>{
	HNode start;
	HNode arr[]=new HNode[11];
	//int size=0;
	void insert(T val) {
		HNode<T> n1=new HNode<T>(val);
		int pos=(Integer)val%arr.length;
	
		if(arr[pos]==null) {
			arr[pos]=n1;
			
		}
		else {
			n1.next=arr[pos];
			arr[pos]=n1;
		
		}
	}
	boolean search(T data) {
		boolean bool=false;
		int count=0;
		int pos=(Integer)data%arr.length;
		HNode temp=arr[pos];
		while(temp!=null) {
			if(temp.data==data){
				bool=true;
				System.out.println(bool);
				System.out.println("Found "+data+"at index" +" "+pos+""+"-->"+"positon"+" "+count);
				break;
			}
			count++;
			temp=temp.next;
			
		}
		System.out.println("Found "+data+"at index" +" "+pos+""+"-->"+"positon"+" "+count);
		System.out.println(bool);
		return bool;
	}
	void remove(T data) {
		int n=0;
		int pos=(Integer)data%arr.length;
		HNode temp=arr[pos];
		if(temp.data==data) {
			temp=temp.next.next;
			arr[pos]=temp;
		}
		while(temp.next.data!=data) {
			n++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
void show() {
	for(int i=0;i<arr.length;i++) {
		HNode temp=arr[i];
		System.out.print(i+"-->"+" |");
	    while(temp!=null) {
	    	System.out.print(temp.data+"-->");
	    	temp=temp.next;
	    }
	    System.out.println();
	}
}

void AddInFile(T data) throws IOException{
	if(!search(data)) {
		FileWriter fl=new FileWriter("/home/admin1/Desktop/Hashing.txt",true);
		BufferedWriter bw=new BufferedWriter(fl);
		bw.write(""+data+" ");
		bw.flush();
		bw.close();
		fl.close();
		insert(data);
	}
	else {
		remove(data);
		FileWriter fl=new FileWriter("/home/admin1/Desktop/Hashing.txt");
		BufferedWriter bw=new BufferedWriter(fl);
		fl.write("");
		for(int i=0;i<arr.length;i++) {
			HNode temp=arr[i];
		    while(temp!=null) {
		    	bw.write(""+temp.data+" ");
		    	//bw1.flush();
		    	 temp=temp.next;
		    }
		        //temp=temp.next;
		    }
		bw.flush();
		bw.close();
		fl.close();
	}
}

}

public class Hashing {

	public static void main(String[] args) throws Exception{
		HLinked <Integer>obj=new HLinked<Integer>();
		File file=new File("/home/admin1/Desktop/Hashing.txt");
		Scanner sc=new Scanner(file);
		//sc.useDelimiter(",");
		//sc.useDelimiter(" ");
		while(sc.hasNext()) {
			obj.insert(Integer.parseInt(sc.next()));
		}
		obj.show();
		//obj.search(100);
		//obj.remove(32);
		obj.AddInFile(5);
		//System.out.println("removed Succesfully");
		obj.show();
		//obj.addInFile();
	}

}
