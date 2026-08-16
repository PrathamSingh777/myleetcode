// Title: Lowest Common Ancestor of a Binary Search Tree
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: hit null, or found one of our targets — stop and report up
        if (root == null || root == p || root == q) {
            return root;
        }

       if(root.val>p.val&&root.val>q.val){
        return lowestCommonAncestor(root.left,p,q);
       } 
         if(root.val<p.val&&root.val<q.val){
        return lowestCommonAncestor(root.right,p,q);
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
/**
 * Definition for a binary tree node.
