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
    static int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        findMax(root);
        return max;
    }
    
    public int findMax(TreeNode root){
        if (root == null) return 0;
        
        int l = findMax(root.left);
        int r = findMax(root.right);
        int sum = root.val;
        if (l > 0) sum += l;
        if (r > 0) sum += r;
        max = Math.max(sum, max);
        
        if (Math.max(l, r) > 0) return root.val+Math.max(l, r);
        else return root.val;
    }
}