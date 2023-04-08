package lecture28;

import java.util.Stack;

public class Insert_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_Down(st, -8); //insert -8 at first position
		System.out.println(st);
	}
	private static void Insert_Down(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int val = st.pop();
		Insert_Down(st, item);
		st.push(val);
	}

}