// Title: Binary Tree Maximum Path Sum
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {

    public int helper(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, helper(root.left, res));
        int right = Math.max(0, helper(root.right, res));

        // Maximum path passing through current node
        res[0] = Math.max(res[0], root.val + left + right);

        // Return maximum gain to parent
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{Integer.MIN_VALUE};

        helper(root, res);
