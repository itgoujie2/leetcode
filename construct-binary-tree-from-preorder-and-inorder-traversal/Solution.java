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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int preEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        return buildTree(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }
    
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if (preStart > preEnd || inStart > inEnd) return null;
        
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        int k=0;
        for(int i=0; i<=inEnd; i++){
            if (inorder[i] == rootVal){
                k = i;
                break;
            }
        }
        
        root.left = buildTree(preorder, preStart+1, preStart+k-inStart, inorder, inStart, k-1);
        root.right = buildTree(preorder, preStart+k-inStart+1, preEnd, inorder, k+1, inEnd);
        return root;
    }
}