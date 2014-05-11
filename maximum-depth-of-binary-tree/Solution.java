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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max = 1;
        return maxDepth(root, max);
    }
    
    public int maxDepth(TreeNode root, int max){
        if (root == null) return max-1;
        
        return Math.max(maxDepth(root.left, max+1), maxDepth(root.right, max+1));
    }
}