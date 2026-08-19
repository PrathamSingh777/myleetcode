// Title: Kth Largest Element in a Stream
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/kth-largest-element-in-a-stream/

class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        pq = new PriorityQueue<>();

        // Add initial numbers
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {

        pq.offer(val);

        // Keep only k largest elements
