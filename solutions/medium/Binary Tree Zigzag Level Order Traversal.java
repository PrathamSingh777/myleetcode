// Title: Binary Tree Zigzag Level Order Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

        lst = new ArrayList<>();
            ans.add(lst);
        
        if(count%2!=0){
            Collections.reverse(lst);            
        }
TreeNode curr = q.poll();
if(curr==null){
    if(!q.isEmpty()){
        q.add(null);
        count++;
    }else{
        if(count%2!=0){
            Collections.reverse(lst);            
