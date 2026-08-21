// Title: Binary Search Tree to Greater Sum Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

    public TreeNode bstToGst(TreeNode root) {

        if (root == null) {
            return null;

    int sum = 0;
/**
class Solution {
        }

        bstToGst(root.right);
        root.val = sum;
        bstToGst(root.left);
        return root;

    }
        sum += root.val;

}
