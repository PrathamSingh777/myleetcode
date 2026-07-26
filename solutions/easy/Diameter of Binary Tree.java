// Title: Diameter of Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/diameter-of-binary-tree/

        int right =  helper(root.right, res);

        // Maximum path passing through current node
        int left = helper(root.left, res);

        }
            return 0;
        if (root == null) {
public int helper(TreeNode root, int[] res) {

        res[0] = Math.max(res[0], (1+left + right));

        // Return maximum gain to parent
        return  1+Math.max(left, right);
    }


    public int diameterOfBinaryTree(TreeNode root) {
         int[] res = new int[]{Integer.MIN_VALUE};

        helper(root, res);
