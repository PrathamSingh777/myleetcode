// Title: Rotting Oranges
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotting-oranges/

    for(int c= 0;c<grid[0].length;c++){
        if(grid[r][c]==2){
            q.add( new pair(r,c,0));
        }else if(grid[r][c]==1){
            fresh++;
        }

    }
}
int timer= 0;
while(!q.isEmpty()){
         pair p = q.remove();
 timer = p.t;
