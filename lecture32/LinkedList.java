package lecture32;

public class LinkedList {
	public class Node {
		int val;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("x");
	}

	public void AddAtIndex(int item, int k) throws Exception {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}

	public int GetFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is empty.");
		}
		return head.val;
	}

	public int GetLast() throws Exception {
		if (size == 0) {
			GetFirst();
		}
		return tail.val;
	}

	public int GetAtIndex(int k) throws Exception {
		return GetNode(k).val;
	}

	public Node GetNode(int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("k is not in range.");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int RemoveFirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;
	}

	public int RemoveLast() throws Exception {
		if (size == 1) {
			Node temp = tail;
			head = null;
			tail = null;
			size--;
			return temp.val;
		} else {
			int value = tail.val;
			Node temp = GetNode(size - 2);
			temp.next = null;
			tail = temp;
			size--;
			return value;
		}
	}

	public int RemoveAtIndex(int k) throws Exception {
		if (k == 0) {
			return RemoveFirst();
		} else if (k == size - 1) {
			return RemoveLast();
		} else {
			Node k_1th = GetNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.val;
		}
	}
}
