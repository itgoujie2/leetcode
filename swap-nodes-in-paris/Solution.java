/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode after = curr.next;
        
        while (true){
            prev.next = after;
            curr.next = after.next;
            after.next = curr;
            
            prev = curr;
            curr = curr.next;
            if (curr == null) break;
            after = curr.next;
            if (after == null) break;
            
            
        }
        
        return dummy.next;
        
        
    }
}