// Title: Keys and Rooms
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/keys-and-rooms/

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

    }

    private void dfs(int roomnum, List<List<Integer>> rooms) {

    HashSet<Integer> set = new HashSet<>();

dfs(0,rooms);

return rooms.size()==set.size();
class Solution {
set.add(roomnum);
for(int i=0; i<rooms.get(roomnum).size();i++){
    if(!set.contains(rooms.get(roomnum).get(i))){
        dfs(rooms.get(roomnum).get(i),rooms);
    }
}

