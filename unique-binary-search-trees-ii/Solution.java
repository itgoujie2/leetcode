/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    
    public ArrayList<TreeNode> helper(int start, int end){
        ArrayList<TreeNode> trees = new ArrayList<TreeNode>(); 
        if (start > end){
            trees.add(null);
            return trees;
        }
        
        for (int k=start; k<=end; k++){
            ArrayList<TreeNode> left = helper(start, k-1);
            ArrayList<TreeNode> right = helper(k+1, end);
            
            for (TreeNode leftTrees : left)
                for (TreeNode rightTrees : right){
                    TreeNode root = new TreeNode(k);
                    root.left = leftTrees;
                    root.right = rightTrees;
                    trees.add(root);
                }
        }
        
        return trees;
    }
}