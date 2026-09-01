// Title: Recover Binary Search Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/recover-binary-search-tree/

        if (root == null) {
            return lst;

    private ArrayList<Integer> dfs(TreeNode root) {
    }

        trav(root, val1, val2);

        }
                val2 = lst.get(i + 1);
            }
                }

        }
        dfs(root.left);
        lst.add(root.val);
        dfs(root.right);
        return lst;

    }

private void trav(TreeNode root , Integer val1, Integer val2){
if(root==null){
