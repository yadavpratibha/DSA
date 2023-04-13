package lecture28;

public class Stack {
	private int[] arr;
	private int tos; //index
	
	//constructor
	public Stack() {   //if size of stack is not given
		arr=new int[5];
		tos=-1;
	}
	public Stack(int cap) {   //if size of stack is given
		arr=new int[cap];
		tos=-1;
	}
	
	
	public boolean isEmpty() {  //isEmpty
		return tos==-1;
	}
	
	public boolean isFull() {  //isFull
		return tos==arr.length-1;
	}
	
	public void push(int item) throws Exception {  //push OR input item
		if(isFull()) {
			throw new Exception("Stack is full.");
		}
		tos++;
		arr[tos]=item;
	}
	public int size() {  //size of stack
		return tos+1;
	}
	
	public int pop() throws Exception {  //pop item
		if(isEmpty()) {
			throw new Exception("Stack is empty.");
		}
		int val=arr[tos];
		tos--;
		return val;
	}
	
	public int peek()throws Exception {  //show item at top
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int val=arr[tos];
		return val;
	}
	
	public void Display() {  //Display Stack
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
