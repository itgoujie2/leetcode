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
    static TreeNode pre;
    static TreeNode first;
    static TreeNode second;
    
    public void recoverTree(TreeNode root) {
        pre = null;
        first = null;
        second = null;
        helper(root);
        int temp;
        temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public void helper(TreeNode root){
        if (root == null) return;
        
        helper(root.left);
        if (pre == null) pre = root;
        else{
            if (pre.val > root.val){
                if (first == null) first = pre;
                second = root;
            }
            pre = root;
        }
        helper(root.right);
    }
}