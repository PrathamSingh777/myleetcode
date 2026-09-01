// Title: Binary Search Tree Iterator
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search-tree-iterator/

st.push(root);
pushleft(root.left);
    }

    public int next() {
TreeNode node = st.pop();
if(node.right!=null){
pushleft(node.right);
}
return node.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }
}

}
/**
