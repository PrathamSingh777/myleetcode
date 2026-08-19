// Title: Construct Binary Tree from Inorder and Postorder Traversal
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

    return null;
}
TreeNode root = new TreeNode(postorder[postindx]);
postindx--;

 int indx =search(inorder,left,right,root.val) ;
root.right = helper(inorder, postorder, indx + 1, right);
    public  TreeNode helper(int[] inorder, int[] postorder ,int left , int right ){
if(left> right){
return root;
    }
    private int search(int []inorder, int left , int right, int target){
for(int i=left;i<=right;i++){
    if(inorder[i]==target){
        return i;
    }
root.left = helper(inorder, postorder, left, indx - 1);
    }
   
}

 return -1;

    }
}
