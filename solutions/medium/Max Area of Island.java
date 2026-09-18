// Title: Max Area of Island
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/max-area-of-island/

    }

    private void dfs(int r, int c, int grid[][]) {

        hst.add(new pair(r, c));

        count++;

        for (int i = 0; i < 4; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < grid.length &&
                nc >= 0 && nc < grid[0].length &&
                grid[nr][nc] == 1 &&
                !hst.contains(new pair(nr, nc))) {

                dfs(nr, nc, grid);
            }
        }
    }
}
