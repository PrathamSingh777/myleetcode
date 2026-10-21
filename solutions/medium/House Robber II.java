// Title: House Robber II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/house-robber-ii/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 
        return Math.max(rob_helper(nums, 0, n - 2), rob_helper(nums, 1, n - 1));
    }

    int rob_helper(int[] nums, int x, int y) {
        
        int[][] dp = new int[2][nums.length];

        dp[0][x] = nums[x];
        dp[1][x] = 0;

       
        for (int i = x + 1; i <= y; i++) {
            dp[0][i] = nums[i] + dp[1][i - 1];
            dp[1][i] = Math.max(dp[1][i - 1], dp[0][i - 1]);
        }

        return Math.max(dp[0][y], dp[1][y]);
    }
}
