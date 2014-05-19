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
    static int sum;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();    
        helper(root, result);
        return sum;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> result){
        result.add(root.val);
        if (root.left == null && root.right == null){
            ArrayList<Integer> temp = new ArrayList<Integer>(result);
            int num = convert(temp);
            sum += num;
        }
        
        if (root.left != null) helper(root.left, result);
        if (root.right != null) helper(root.right, result);
        result.remove(result.size()-1);
    }
    
    public int convert(ArrayList<Integer> temp){
        int tracker = 0;
        for (int i=0; i<temp.size(); i++){
            tracker = tracker*10 + temp.get(i);
        }
        return tracker;
    }
}