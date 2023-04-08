package lecture28;

public class Queue {
	private int[] arr;
	private int front=0;
	private int size=0;
	
	public Queue() {  //if size of Queue is not given
		arr=new int[5];
	}
	public Queue(int cap) {  //if size of Queue is given
		arr=new int[cap];
	}
	
	public boolean isEmpty() {  //isEmpty
		return size==0;
	}
	public boolean isFull() {  //isFull
		return size==arr.length;
	}
	
	public int size() {  //size of Queue
		return size;
	}
	
	public void Enqueue(int item) throws Exception{  //Insertion of item
		if(isFull()) {
			throw new Exception("Queue is full.");
		}
		int idx=(front+size)%arr.length; //for circular Queue
		arr[idx]=item;
		size++;
	}
	
	public int Dequeue() throws Exception{  //Deletion of item
		if(isEmpty()) {
			throw new Exception("Queue is Empty.");
		}
		int val=arr[front];
		front=(front+1)%arr.length; //for circular Queue
		size--;
		return val;
	}
	
	public int GetFront() throws Exception {  //Get first element
		if(isEmpty()) {
			throw new Exception("Queue is Empty.");
		}
		
		int val=arr[front];
		return val;
	}
	
	public void Display() {  //print Queue
		for(int i=0;i<size;i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
