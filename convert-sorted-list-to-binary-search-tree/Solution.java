/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode h;
    
    public TreeNode sortedListToBST(ListNode head) {
        
        int len = 0;
        ListNode p = head;
        while (p != null){
            p = p.next;
            len++;
        }
        h = head;
        
        return helper(0, len-1);
    }
    
    public TreeNode helper(int start, int end){
        if (start > end) return null;
        
        int mid = start + (end - start)/2;
        
        TreeNode left = helper(start, mid-1);
        TreeNode parent = new TreeNode(h.val);
        h = h.next;
        TreeNode right = helper(mid+1, end);
        parent.left = left;
        parent.right = right;
        return parent;
    }
}