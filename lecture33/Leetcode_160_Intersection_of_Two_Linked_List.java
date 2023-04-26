package lecture33;

public class Leetcode_160_Intersection_of_Two_Linked_List {
	public class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	      ListNode A=headA;
	      ListNode B=headB;
	      while(A!=B) {
	    	  if(A!=null) {
	    		  A=A.next;
	    	  }
	    	  else {
	    		  A=headB;
	    	  }
	    	  if(B!=null) {
	    		  B=B.next;
	    	  }
	    	  else {
	    		  B=headA;
	    	  }
	      }
	      return A;
	    }
	}
}
