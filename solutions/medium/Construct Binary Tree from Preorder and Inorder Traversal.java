// Title: Construct Binary Tree from Preorder and Inorder Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

        TreeNode root = new TreeNode(preorder[preIdx]);
        preIdx++;

        int inIdx = search(inorder, left, right, root.val);

        root.left = helper(preorder, inorder, left, inIdx - 1);
        root.right = helper(preorder, inorder, inIdx + 1, right);

        return root;
    }

    private int search(int[] inorder, int left, int right, int target) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

