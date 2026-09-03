// Title: Populating Next Right Pointers in Each Node
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

          if (root == null)
    public Node connect(Node root) {
class Solution {

*/
};
class Node {
// Definition for a Node.
            return null;
    Queue<Node> q= new LinkedList<>();    
q.add(root);
q.add(null);
Node prev = null;
while(!q.isEmpty()){
    Node curr = q.poll();
    if(curr==null){
        if(!q.isEmpty()){
            q.add(null);
            prev = null;
