package lecture33;

public class Leetcode_141_Linked_List_Cycle {
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	        ListNode Slow=head;
	        ListNode Fast=head;
	        while(Fast!=null && Fast.next!=null) {
	        	Slow=Slow.next;
	        	Fast=Fast.next.next;
	        	if(Slow==Fast) {
	        		return true;
	        	}
	        }
	        return false;
	    }
	}
}
