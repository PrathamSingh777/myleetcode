// Title: Lowest Common Ancestor of a Binary Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

        }

        // Recurse into both subtrees (post-order: children resolve first)
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Case 1: found something on both sides -> current node is the split point -> LCA
        if (left != null && right != null) {
            return root;
        }

        // Case 2: only one side found something -> pass it up unchanged

        if(left != null){
            return left;
        } 
        
    }
            return root;
        return right;
}
