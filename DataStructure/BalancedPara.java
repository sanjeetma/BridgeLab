class Stack{
	int max=100;
	char arr[]=new char[max];
     int size=0;
	int top=-1;
	void push(char ch) {
		if(top==max) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top]=ch;
			size++;
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			size--;
		}
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	void check(String str) {
		char[] ch=str.toCharArray();
		for( int i=0;i<ch.length;i++)
		{
         if(ch[i]=='('){
        	 push(ch[i]);
         }
         if(ch[i]==')') {
        	 pop();
         }
			
		}
	}
	void show() {
		if(top==-1) {
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balance");
		}
	}
	
}
public class BalancedPara {

	public static void main(String[] args) {
		int i;
		Stack obj=new Stack();
		String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		obj.check(str);
		obj.display();
		obj.show();
		}

}
