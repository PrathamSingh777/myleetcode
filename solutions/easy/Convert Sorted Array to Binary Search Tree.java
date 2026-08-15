// Title: Convert Sorted Array to Binary Search Tree
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

/**
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
    }
 return dfs(nums,0,nums.length-1);
    public TreeNode dfs(int []nums, int left, int right){
if(left>right){
    return null;
}
if(left==right){
    return new TreeNode( nums[left]);
}
    }
return root ;
int mid = (left+right)/2;
root.left = dfs(nums,left,mid-1);
root.right = dfs(nums,mid+1,right);
TreeNode root = new TreeNode (nums[mid]);

}
