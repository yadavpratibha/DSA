import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10); // insert element
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st); // display stack
		int s = st.peek();
		System.out.println(s);
		System.out.println(st.pop()); // delete element
		System.out.println(st.peek());
		System.out.println(st.size()); // size of stack
		System.out.println(st.isEmpty()); // is stack empty

	}

}
