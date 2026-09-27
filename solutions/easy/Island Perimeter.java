// Title: Island Perimeter
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/island-perimeter/


                int nr = p.r + dr[i];
                int nc = p.c + dc[i];

                // Outside grid
                if (nr < 0 || nr >= grid.length ||
                    nc < 0 || nc >= grid[0].length) {

                    peri++;
                }

                // Water
                else if (grid[nr][nc] == 0) {

                    peri++;
                }

                // Unvisited land
                else if (grid[nr][nc] == 1) {

                    st.push(new pair(nr, nc));
                }
            }
        }
    }
}
