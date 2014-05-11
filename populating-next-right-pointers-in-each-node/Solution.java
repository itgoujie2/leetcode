/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        helper(root, null);
    }
    
    public void helper(TreeLinkNode root, TreeLinkNode sibling){
        if (root == null) return;
        else root.next = sibling;
        
        helper(root.left, root.right);
        
        if (sibling != null){
            helper(root.right, sibling.left);
        }
        else{
            helper(root.right, null);
        }
    }
}