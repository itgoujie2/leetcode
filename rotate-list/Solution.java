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
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || n == 0) return head;
        
        int len = 1;
        ListNode tracker = head;
        while (tracker.next != null){
            len++;
            tracker = tracker.next;
        }
        int step = len - n%len;
        tracker.next = head;
        for (int i=0; i<step; i++){
            tracker = tracker.next;
        }
        head = tracker.next;
        tracker.next = null;
        return head;
    }
}