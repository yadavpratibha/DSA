package lecture28;

public class Stack_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st.isFull());
		System.out.println(st.peek());
		st.Display();
		st.push(9);
		System.out.println(st.pop());
		st.Display();
		
	}

}
