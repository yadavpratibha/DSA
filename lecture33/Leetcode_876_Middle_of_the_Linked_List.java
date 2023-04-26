package lecture33;

import Practice.Middleofthelinkedlist.ListNode;

public class Leetcode_876_Middle_of_the_Linked_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode Slow = head;
			ListNode Fast = head;
			while (Fast != null && Fast.next != null) {
				Slow = Slow.next;
				Fast = Fast.next.next;
			}
			return Slow;
		}
	}
}
