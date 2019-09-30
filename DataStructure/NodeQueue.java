package Utility;
import java.util.*;
class QueueNode{
	QueueNode next;
	int data;
	QueueNode(int data){
		this.data=data;
	}
}
class LinkedQueue{
	QueueNode front;
	QueueNode rear;
	int size;
	
	
	void enqueue(int data){
		QueueNode node=new QueueNode(data);
		if(front==null&&rear==null) {
			front=node;
			rear=node;
			size++;
		}
		else {
			QueueNode temp=rear;
	        temp.next=node;
	        rear=node;
	        size++;
		}
		
	}
	void deQueue() {
		if(front!=rear) {
			front=front.next;
			size--;
		}
	}
	void addPrime(int lower,int higher) {
		ArrayList<Integer> ls=new ArrayList<Integer>();
		for(int i=lower;i<=higher;i++) {
			if(Util.isPrime(i)) {
				ls.add(i);
			}
		}
		addAnagram(ls);
	}
	void addAnagram(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(Util.isAnagramDigit(list.get(i), list.get(j))) {
					enqueue(list.get(j));
				}
			}
		}
	}
	void show() {
		QueueNode temp=front;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data+" -->");
			temp=temp.next;
		}
		/*while(front!=rear) {
			System.out.println(temp.data+"-->");
			temp=temp.next;
		}*/
	}
	
}
public class NodeQueue {

	public static void main(String[] args) {
		LinkedQueue obj=new LinkedQueue();
		obj.addPrime(0, 1000);
		obj.show();
	}

}
