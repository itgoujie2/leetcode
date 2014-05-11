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
        
        Map<Integer, Integer> storage = new HashMap<Integer, Integer>();
        int tracker = 0;
        ListNode first = head;
        ListNode second = head.next;
        
        storage.put(first.val, ++tracker);
        
        while (second != null){
            if (storage.get(second.val) != null){
                first.next = second.next;
                second = second.next;
                continue;
            }
            storage.put(second.val, ++tracker);
            first = first.next;
            second = second.next;
        }
        
        return head;
    }
}