// Title: Number of Islands
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-islands/

            bfs(grid  ,q);
        }
    }
}
return count ;
    }

    private  void bfs( char[][] grid,  Queue<pair> q){

while(!q.isEmpty()){
     pair p =  q.remove();
for(int i=0; i<4 ; i++){
    int nr = p.r + dr[i];
     int nc = p.c + dc[i];

     if(nr>=0 && nr<grid.length&& nc>=0&& nc<grid[0].length&& grid[nr][nc]=='1'&&!visited.
     contains( new pair (nr,nc))){
        visited.add(new pair(nr,nc));
        q.add(new pair(nr,nc));

     }
