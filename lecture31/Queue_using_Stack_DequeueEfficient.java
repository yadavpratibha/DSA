package lecture31;
import lecture29.Dynamic_Stack;
public class Queue_using_Stack_DequeueEfficient {
	private Dynamic_Stack ds;
	
	public Queue_using_Stack_DequeueEfficient() {
		ds=new Dynamic_Stack();
	}
	
	public boolean isEmpty() {
		return ds.isEmpty();
	}
	
	public int size() {
		return ds.size();
	}
	
	public int Dequeue()throws Exception {
		return ds.pop();
	}
	
	public void Enqueue(int item)throws Exception {
		Dynamic_Stack temp=new Dynamic_Stack();
		while(!ds.isEmpty()) {
			temp.push(ds.pop());
		}
		ds.push(item);
		while(!temp.isEmpty()) {
			ds.push(temp.pop());
		}
	}
	
	public int getFront()throws Exception{
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
