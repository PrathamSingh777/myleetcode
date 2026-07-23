// Title: Univalued Binary Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/univalued-binary-tree/

        

    }
if (root ==null){
    return true ;
}
    private boolean preorder(TreeNode  node , int val){
return preorder(root,val);
if(node==null){

    return true;
}
if(node.val!=val){
    return false;
}
return preorder(node.left,val)&&preorder(node.right,val);
    }
    public boolean isUnivalTree(TreeNode root) {
/**
class Solution {
int val = root.val;
}
