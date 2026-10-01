// Title: 01 Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/01-matrix/

                    q.add(new pair(i, j));
                } else {
                    mat[i][j] = -1;
                }
            }
        }

   
        while (!q.isEmpty()) {

            pair p = q.remove();

            for (int i = 0; i < 4; i++) {

                int nr = p.r + dr[i];
                int nc = p.c + dc[i];

                if (nr >= 0 && nr < mat.length &&
                    nc >= 0 && nc < mat[0].length &&
                    mat[nr][nc] == -1) {

                    mat[nr][nc] = mat[p.r][p.c] + 1;
                    q.add(new pair(nr, nc));
                }
            }
        }

