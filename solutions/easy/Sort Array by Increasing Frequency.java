// Title: Sort Array by Increasing Frequency
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sort-array-by-increasing-frequency/

class Solution {
    public int[] frequencySort(int[] 
    nums) {
       int n= nums.length; 
HashMap<Integer ,Integer> map =new 
HashMap<>();
for( int num : nums){
map.put(num,map.getOrDefault(num,0)+1);
}
Integer [] arr = new Integer[n]; 
for(int i=0; i<n;i++){
arr[i]=nums[i];
}
Arrays.sort (arr,(a,b)->{
    if(!map.get(a).equals(map.get(b))){
        return map.get(a)-map.get(b);
    }
    else{
        return b-a;
