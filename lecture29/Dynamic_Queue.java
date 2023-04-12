package lecture29;

import lecture28.Queue;

public class Dynamic_Queue extends Queue {
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] narr = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (i + front) % arr.length;
				narr[i] = arr[idx];
			}
			arr = narr;
			front = 0;
		}
		super.Enqueue(item);
	}
}

