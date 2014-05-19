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
    static int depth;
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        depth = 0;
        helper(root, 1, results);
        Collections.reverse(results);
        return results;
    }
    
    public void helper(TreeNode root, int level, ArrayList<ArrayList<Integer>> results){
        if (root == null){
            return;
        }
        if (level > results.size()){
            results.add(new ArrayList<Integer>());
            depth = Math.max(results.size(), depth);
        }
        
        results.get(level-1).add(root.val);
        helper(root.left, level+1, results);
        helper(root.right, level+1, results);
        
    }
}