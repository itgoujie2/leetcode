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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        int tracker;
        
        TreeNode p = root;
        myStack.push(p);
        
        while(!myStack.isEmpty()){
            TreeNode temp = myStack.peek();
            result.add(temp.val);
            myStack.pop();
            
            if (temp.right != null) myStack.push(temp.right);
            if (temp.left != null) myStack.push(temp.left);
        }
        
        return result;
    }
}