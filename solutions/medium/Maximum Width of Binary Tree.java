// Title: Maximum Width of Binary Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-width-of-binary-tree/


                TreeNode node = curr.node;
                long index = curr.index;

                last = index;

                if (node.left != null) {
                    q.offer(new Pair(node.left, 2 * index + 1));
                }

                if (node.right != null) {
                    q.offer(new Pair(node.right, 2 * index + 2));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return (int) maxWidth;
    }
}
