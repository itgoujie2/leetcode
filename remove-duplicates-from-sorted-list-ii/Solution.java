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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        Map<Integer, Boolean> storage = new HashMap<Integer, Boolean>();
        ListNode tracker = head;
        while (tracker != null){
            if (storage.get(tracker.val) == null){
                storage.put(tracker.val, false);
            }
            else{
                storage.put(tracker.val, true);
            }
            tracker = tracker.next;
        }
        
        
        while (head != null && storage.get(head.val)){
            head = head.next;
        }
        tracker = head;
        while (tracker != null){
            if (tracker.next != null && storage.get(tracker.next.val)){
                tracker.next = tracker.next.next;
            }
            else{
                tracker = tracker.next;
            }
        }
        return head;
    }
}