// Title: Count the Number of Complete Components
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-the-number-of-complete-components/


            if (!set.contains(t)) {

                int count = 0;

        int ans = 0;

        for (int t = 0; t < n; t++) {

        for (int j = 0; j < edges.length; j++) {
            adj.get(edges[j][0]).add(edges[j][1]);
            adj.get(edges[j][1]).add(edges[j][0]);
        }
    public int countCompleteComponents(int n, int[][] edges) {

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

    HashSet<Integer> set = new HashSet<>();
    List<List<Integer>> adj = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();

class Solution {
