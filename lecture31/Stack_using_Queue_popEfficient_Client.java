package lecture31;

public class Stack_using_Queue_popEfficient_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_using_Queue_popEfficient st = new Stack_using_Queue_popEfficient();
		st.push(10);
		st.push(20);
		st.push(1);
		st.push(-10);
		st.push(105);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());

	}

}

