// Title: Balanced Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/balanced-binary-tree/

// isBalanced( root.left);
// isBalanced( root.right);
// return height(left)
if (Math.abs(height(root.left) - height(root.right)) > 1) {
    return false;
}

return isBalanced( root.left)&&isBalanced( root.right);
}
    return true;
    public boolean isBalanced(TreeNode root) {

if (root==null){
/**
class Solution {
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
