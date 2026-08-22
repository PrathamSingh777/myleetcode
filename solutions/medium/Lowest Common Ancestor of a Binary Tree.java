// Title: Lowest Common Ancestor of a Binary Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // Search left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Search right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // p and q found in different subtrees
        if (left != null && right != null) {
            return root;
        }
        // Return whichever subtree found p or q
        if (left != null) {
            return left;
        }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
class Solution {
        return right;
    }
