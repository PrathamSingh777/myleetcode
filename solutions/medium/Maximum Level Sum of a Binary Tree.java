// Title: Maximum Level Sum of a Binary Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

                    anslvl = currlvl;
                }
                    maxdata = data;

                currlvl++;
                data = 0;

                // Add separator for next level
                if (!q.isEmpty()) {
                    q.add(null);
                }

            } else {

                data = data + curr.val;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
