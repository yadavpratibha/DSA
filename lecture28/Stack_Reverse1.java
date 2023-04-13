package lecture28;

import java.util.Stack;

public class Stack_Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		for (int i = 0, j = 10; i < 5; i++) {
			st.push(j);
			j += 10;
		}
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}

		int val = st.pop(); // while going up pop elements
		Reverse(st);
		Insert_Down(st, val);
	}

	public static void Insert_Down(Stack<Integer> st, int item) { // start inserting elements from the bottom
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int val = st.pop();
		Insert_Down(st, item);
		st.push(val);
	}
}
