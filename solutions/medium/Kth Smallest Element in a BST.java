// Title: Kth Smallest Element in a BST
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

/**
class Solution {
    public int kthSmallest(TreeNode root, int k) {
if(root==null){



    ArrayList<Integer> arr = new ArrayList<>();
    return 0;
} 
arr = dfs(root);
return arr.get(k-1);
    }
    public  ArrayList<Integer> dfs( TreeNode root){
        if(root==null){
            return arr;
        }
        dfs(root.left);
        arr.add(root.val);
        dfs(root.right);
        return arr;
