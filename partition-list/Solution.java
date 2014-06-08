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
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        
        ListNode dummyL = new ListNode(-1);
        ListNode dummyR = new ListNode(-1);
        ListNode trackerL = dummyL;
        ListNode trackerR = dummyR;
        ListNode curr = head;
        
        while(curr != null){
            if (curr.val < x){
                trackerL.next = curr;
                trackerL = curr;
            }   
            else{
                trackerR.next = curr;
                trackerR = curr;
            }
            curr = curr.next;
        }
        trackerL.next = dummyR.next;
        trackerR.next = null;
        
        return dummyL.next;
    }
}