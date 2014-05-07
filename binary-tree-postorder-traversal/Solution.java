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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode last = root;
        myStack.push(root);
        while (myStack != null){
            if (myStack.isEmpty()) break;
            TreeNode temp = myStack.peek();
            if ((temp.left == null && temp.right == null) || (last == temp.right) || (last == temp.left && temp.right == null)){
                result.add(temp.val);
                last = temp;
                myStack.pop();
            }
            else{
                if (temp.right != null) myStack.push(temp.right);
                if (temp.left != null) myStack.push(temp.left);
            }
        }
        
        return result;
    }
}