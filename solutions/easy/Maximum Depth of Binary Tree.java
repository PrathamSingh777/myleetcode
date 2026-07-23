// Title: Maximum Depth of Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/

/**
class Solution {
    public int maxDepth(TreeNode root) {
        
if (root==null){

 int lefty = maxDepth( root.left);
int righty = maxDepth( root.right);
    return 0;
}
    }
return    1+Math.max(lefty,righty);
}
