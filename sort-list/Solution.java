/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

	private static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode sortList(ListNode head) {
    	if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }

        fast = slow;
        slow = slow.next;
        fast.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right){
    	ListNode dummy = new ListNode(-1);

    	for (ListNode p=dummy; left!=null || right!=null; p=p.next){
    		int leftVal = left == null?Integer.MAX_VALUE:left.val;
    		int rightVal = right == null?Integer.MAX_VALUE:right.val;

    		if (leftVal < rightVal){
    			p.next = left;
    			left = left.next;
    		}
    		else{
    			p.next = right;
    			right = right.next;
    		}
    	}

    	return dummy.next;
    }

}