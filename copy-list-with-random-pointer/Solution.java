/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        for (RandomListNode curr = head; curr != null; ){
            RandomListNode node = new RandomListNode(curr.label);
            node.next = curr.next;
            curr.next = node;
            curr = curr.next.next;
        }
        
        for (RandomListNode curr = head; curr != null; ){
            if (curr.random != null) curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        
        RandomListNode dummy = new RandomListNode(-1);
        for (RandomListNode curr = head, newCurr = dummy; curr != null; ){
            newCurr.next = curr.next;
            newCurr = newCurr.next;
            curr.next = curr.next.next;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}