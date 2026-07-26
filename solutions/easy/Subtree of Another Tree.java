// Title: Subtree of Another Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/subtree-of-another-tree/

       if (same(root, subRoot)) {
        

        }
            return false;

        if (root == null) {
        }

   if (subRoot == null) {
            return true;
    return true;
}
return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

private boolean same(TreeNode p,TreeNode q){
    if (p==null&& q==null){
        return true;
    }
    if(p==null||q==null){
        return false;
    }
    if(p.val!=q.val){
        return false;
    }
