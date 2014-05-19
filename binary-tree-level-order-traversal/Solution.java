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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        helper(root, 1, results);
        return results;
    }
    
    public void helper(TreeNode root, int level, ArrayList<ArrayList<Integer>> results){
        if (root == null){
            return;
        }
        if (level > results.size()){
            results.add(new ArrayList<Integer>());
        }
        results.get(level-1).add(root.val);
        helper(root.left, level+1, results);
        helper(root.right, level+1, results);
    }
}