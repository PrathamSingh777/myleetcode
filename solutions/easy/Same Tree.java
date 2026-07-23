// Title: Same Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/same-tree/

/**
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
{
if (p == null || q == null) {
        if (p==null && q==null)
    return true;
}
return isSameTree(p.left, q.left) &&
    return false;
}

if (p.val != q.val) {
    return false;
}


       isSameTree(p.right, q.right);
}}
