// Title: Flatten Binary Tree to Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

        pre(root.left,arr);
        arr.add(root);
         pre(root.right,arr);
        }
            return arr;
    private ArrayList<TreeNode>pre(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null){
        
        }
        arr = pre(root,arr); 
ree(root,arr,indx);

        }
        if(root==null){
            return;
    ArrayList<TreeNode> arr = new ArrayList<>();
    int indx = 1;
    public void flatten(TreeNode root) { 
/**
class Solution {
