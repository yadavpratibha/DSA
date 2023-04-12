package lecture29;

import lecture28.Stack;

public class Dynamic_Stack extends Stack {
	public void push(int item) throws Exception { // Overrides push() in Stack
		if (isFull()) {
			int[] narr = new int[2 * arr.length]; // Create new array of twice length
			for (int i = 0; i < arr.length; i++) {
				narr[i] = arr[i]; // copy elements to new array
			}
			arr = narr;
		}
//		tos++;
//		arr[tos] = item;
		super.push(item); // to call method of parent class
	}
	
	public void Display() {
		for(int i=0;i<tos+1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
