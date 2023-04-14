package lecture31;
import lecture29.Dynamic_Stack;
public class Queue_using_Stack_EnqueueEfficient {

	private Dynamic_Stack ds;
	
	public Queue_using_Stack_EnqueueEfficient() {  //constructor
		ds=new Dynamic_Stack();
	}
	
	public boolean isEmpty() {  //if Queue is Empty
		return ds.isEmpty();
	}
	
	public int size() {  //size of Queue
		return ds.size();
	}
	
	public void Enqueue(int item) throws Exception {
		ds.push(item);
	}
	
	public int Dequeue() throws Exception{
		Dynamic_Stack temp=new Dynamic_Stack();
		while(ds.size()!=1) {
			temp.push(ds.pop());
		}
		int val=ds.pop();
		while(!temp.isEmpty()) {
			ds.push(temp.pop());
		}
		return val;
	}
	
	public int getFront()throws Exception {
		Dynamic_Stack temp=new Dynamic_Stack();
		int val=0;
		while(!ds.isEmpty()) {
			val=ds.pop();
			temp.push(val);
		}
		while(!temp.isEmpty()) {
			ds.push(temp.pop());
		}
		return val;
	}
	
}
