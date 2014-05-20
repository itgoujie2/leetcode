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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists.size() == 0) return null;
        
        ListNode p = lists.get(0);
        for (int i=1; i<lists.size(); i++){
            p = mergeList(p, lists.get(i));
        }
        return p;
    }
    
    public ListNode mergeList(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode temp = new ListNode(-1);
        ListNode tracker = temp;
        
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                tracker.next = l1;
                tracker = tracker.next;
                l1 = l1.next;
            }else{
                tracker.next = l2;
                tracker = tracker.next;
                l2 = l2.next;
            }
        }
        
        tracker.next = l1 == null ? l2 : l1;
        
        return temp.next;
    }
}