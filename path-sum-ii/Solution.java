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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        pathSum(root, sum, result, results);
        return results;
    }
    
    private void pathSum(TreeNode root, int tracker, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
        if (root == null) return;
        result.add(root.val);
        if (root.left == null && root.right == null){
            if (tracker == root.val){
                ArrayList<Integer> temp = new ArrayList<Integer>(result);
                results.add(temp);
            }
        }
        pathSum(root.left, tracker-root.val, result, results);
        pathSum(root.right, tracker-root.val, result, results);
        result.remove(result.size()-1);
    }
}