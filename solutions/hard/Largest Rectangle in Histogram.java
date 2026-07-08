// Title: Largest Rectangle in Histogram
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/largest-rectangle-in-histogram/

        return prevSmaller;
    }

    private int[] nextEle(int[] heights) {

        int n = heights.length;
        int[] nextSmaller = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty())
                nextSmaller[i] = n;
            else
                nextSmaller[i] = st.peek();

            st.push(i);
        }

        return nextSmaller;
    }
}
