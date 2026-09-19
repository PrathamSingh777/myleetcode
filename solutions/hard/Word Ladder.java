// Title: Word Ladder
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/word-ladder/


        finalcount = 1;

        while (!q.isEmpty()) {

            int size = q.size();

        visited.add(beginWord);

        return bfs(q, endWord, words);
    }

    private int bfs(Queue<String> q, String target,
                    HashSet<String> words) {
        }

        HashSet<String> words = new HashSet<>(wordList); // CHANGE

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
    int finalcount = 0;
    HashSet<String> visited = new HashSet<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
class Solution {

