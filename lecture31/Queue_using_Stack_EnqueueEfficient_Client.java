package lecture31;

public class Queue_using_Stack_EnqueueEfficient_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue_using_Stack_EnqueueEfficient q=new Queue_using_Stack_EnqueueEfficient();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println(q.Dequeue());
		System.out.println(q.getFront());
	}

}
