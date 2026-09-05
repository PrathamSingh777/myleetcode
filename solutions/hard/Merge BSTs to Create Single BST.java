// Title: Merge BSTs to Create Single BST
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/merge-bsts-to-create-single-bst/

                TreeNode newTree = map.get(node.val);

                // Attach its children
                node.left = newTree.left;
                node.right = newTree.right;

                // Tree has now been used
                map.remove(node.val);
            }
        }

        // IMPORTANT:
        // Even after attaching a tree, we must validate
        // its newly attached children.
        return dfs(node.left, low, node.val)
            && dfs(node.right, node.val, high);
    }
}
