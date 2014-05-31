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
        if (root == null) return;
        
        if (root.left != null){
            if (root.right != null){
                root.left.next = root.right;
            }
            else{
                TreeLinkNode p = root.next;
                while (p != null && p.left == null && p.right == null) p = p.next;
                if (p != null) root.left.next = p.left != null ? p.left : p.right;
            }
        }
        
        if (root.right != null){
            TreeLinkNode p = root.next;
            while (p != null && p.left == null && p.right == null) p = p.next;
            if (p != null) root.right.next = p.left != null ? p.left : p.right;
        }
        connect(root.right);
        connect(root.left);
    }
}