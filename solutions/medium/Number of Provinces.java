// Title: Number of Provinces
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-provinces/


                count++;

                dfs(i, isConnected, visited);
            }
        }

        return count;
    }

    public void dfs(int i, int[][] isConnected, boolean[] visited){

        visited[i] = true;
            if(!visited[i]){
        for(int i = 0; i < isConnected.length; i++){


        boolean[] visited = new boolean[isConnected.length];

        int count = 0;

    public int findCircleNum(int[][] isConnected) {

class Solution {
