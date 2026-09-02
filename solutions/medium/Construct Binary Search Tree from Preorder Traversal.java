// Title: Construct Binary Search Tree from Preorder Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

TreeNode root = new TreeNode (preorder[temp]);
temp++;
 int indx = search(inorder, root.val ,lft, rht);
        }
            return null;
        if(lft>rht){

 root.left = construct(preorder,inorder,lft ,indx-1);
    private  TreeNode construct(int[] preorder,int[] inorder, int lft,int rht){

/**
class Solution {
    int temp = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;

int[] inorder = preorder.clone();
Arrays.sort(inorder);

int lft = 0;
int rht = n-1;
 return construct(preorder,inorder,lft,rht);

    }
