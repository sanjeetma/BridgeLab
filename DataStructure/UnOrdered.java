
import java.io.*;
import java.util.*;
class Node{
	String str;
	Node next;
    Node(String s){
    	this.str=s;
    }
}
class Linked{
	Node start;
	int size;
void addAtFirst(String str) {
		Node n1=new Node(str);
		if(start==null) {
			start=n1;
			size++;
		}
		else {
			n1.next=start;
			start=n1;
			size++;
		}
	}
void addAtLast(String str){
			Node n1=new Node(str);
             Node temp=start;
             for(int i=0;i<size-1;i++) {
            	 temp=temp.next;
             }
             temp.next=n1;
             n1.next=null;
             size++;
}
void addAtPos(int index,String str) {
	        Node n1=new Node(str);
			Node temp=start;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			n1.next=temp.next;
			temp.next=n1;
			size++;
			
}
void display() {
		Node temp=start;
		for(int i=0;i<size;i++) {
			System.out.print(temp.str+"-->");
			temp=temp.next;
		}
	}
void removeAtFirst() {
		Node temp=start;
		temp=temp.next;
		start=temp;
		size--;
}
void removeAtLast() {
	 		Node temp=start;
	 		for(int i=0;i<size-1;i++) {
	 			temp=temp.next;
	 			
	 		}
	 		temp.next=null;
	 		size--;
}
void removeAtPos(int index) {
	Node temp=start;
	if(index==0) {
		removeAtFirst();
	}
	else {
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
				
			}
			temp.next=temp.next.next;
			size--;
}
}

	boolean IsStringFound(String str) throws Exception{
		String s=str;
		boolean bool=false;
		Node temp=start;
		for(int i=0;i<size;i++) {
			if(str.equalsIgnoreCase(temp.str)) {
				bool=true;
				System.out.println("Found at"+i);
				removeAtPos(i);
		         removeStringFound(str);
				break;
			}
			temp=temp.next;
			
		}
		//addAtFirst(str); 
		return bool;
	}
void addStringNotFound(String s) throws Exception{
		if(!IsStringFound(s)) {
			addAtLast(s);
			FileWriter writer = new FileWriter("/home/admin1/Desktop/text",true);  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write(" "+s); 
		    System.out.println("Added Suceesfully");
		    buffer.flush();
		    buffer.close();
		}
	}
void removeStringFound(String str) throws Exception {
	FileWriter writer = new FileWriter("/home/admin1/Desktop/text",true);  
    BufferedWriter buffer = new BufferedWriter(writer);  
	File file=new File("/home/admin1/Desktop/text");
	Scanner sc=new Scanner(file);
	String temp=sc.nextLine();
	String temp1=temp.replace(str,"");
	String remove="";
	FileWriter writer1 = new FileWriter("/home/admin1/Desktop/text");  
	        writer1.write(remove);
	        //writer.flush();
			buffer.write(temp1);
			System.out.println("Removed Succesfully");
			writer.flush();
			  buffer.flush();
			    buffer.close();
			    writer.close();
			    
		
	}


}

public class UnOrdered {

	public static void main(String[] args) throws Exception {
		Linked ls=new Linked();
		ArrayList<String>list=new ArrayList<String>();
		File file=new File("/home/admin1/Desktop/text");
		Scanner sc=new Scanner(file);
		Scanner sc1=new Scanner(System.in);
		while(sc.hasNext()) {
			ls.addAtFirst(sc.next());
			}
		System.out.println("Enter String to Search");
	    String s=sc1.nextLine();
		//ls.removeAtFirst();
	    ls.addStringNotFound(s);
	   // System.out.println("Added Suceesfully");
	    
	    ls.display();
	  
	    sc.close();
	    sc1.close();
	  
		
		
		

	}

}
