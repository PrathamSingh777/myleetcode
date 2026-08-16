// Title: Binary Search
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search/


 public int dfs (int []nums,int lt,int rt, int target){
if(lt>rt){
int mid = (lt+rt)/2;
if(nums[mid]==target){
    return mid;
}
else if (nums[mid]>target){
    return dfs(nums,lt,mid-1,target);
    }

      return  dfs(nums,lt,rt,target);
    int rt = nums.length-1;
         int lt = 0;
    public int search(int[] nums, int target) {
    return -1;
}
}else{
    return dfs(nums,mid+1,rt,target);
}

    }
}
    
class Solution {
