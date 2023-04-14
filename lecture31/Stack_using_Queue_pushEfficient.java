package lecture31;

import lecture29.Dynamic_Queue;;

public class Stack_using_Queue_pushEfficient {
	private Dynamic_Queue q;

	public Stack_using_Queue_pushEfficient() {  //constructor
		q = new Dynamic_Queue();
	}
	
	public boolean isEmpty() {  //if Stack is Empty
		return q.size()==0;
	}
	
	public int size() {  //size if Stack
		return q.size();
	}
	
	public void push(int item)throws Exception {
		q.Enqueue(item);
	}
	
	public int pop()throws Exception {
		int val = 0;
		Dynamic_Queue temp=new Dynamic_Queue();
		while(!q.isEmpty()) {
			val=q.Dequeue();
			temp.Enqueue(val);
		}
		
		while(!temp.isEmpty()) {
			q.Enqueue(temp.Dequeue());
		}
		return val;		
	}
	
	public int peek() throws Exception{
		return q.GetFront();
	}
}
