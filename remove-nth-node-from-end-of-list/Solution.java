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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;
        
        for (int i=0; i<n; i++){
            q = q.next;
        }
        
        while (q.next != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        
        return dummy.next;
    }
}