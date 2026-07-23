// Title: Same Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/same-tree/

/**
class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {      // <-- corrected: handle null tree
            return true;
        }

        invertTree(root.left);

        return isSameTree(root.left, root.right);
    }

    public TreeNode invertTree(TreeNode rooti) {

        if (rooti == null) {
            return null;
