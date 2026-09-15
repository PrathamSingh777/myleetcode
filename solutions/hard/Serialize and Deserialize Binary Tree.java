// Title: Serialize and Deserialize Binary Tree
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

                TreeNode right = new TreeNode(Integer.parseInt(parts[i]));
                parent.right = right;
                q2.offer(right);
            }

            i++;
        }

        return root;
    }
}


                
            if(i < parts.length && !parts[i].equals("n")){
            // Right child

            i++;


