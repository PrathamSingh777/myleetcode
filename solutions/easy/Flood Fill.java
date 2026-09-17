// Title: Flood Fill
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/flood-fill/

Queue<pair> q = new LinkedList<>();
q.add(new pair(sr,sc));
int val = image[sr][sc];
image[sr][sc]=color;

while(!q.isEmpty()){
      pair p = q.remove();
for(int i = 0;i<4;i++){
int nr = p.r+dr[i];
int nc = p.c+dc[i];
if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length && image[nr][nc]==val){
    image[nr][nc]=color;
    q.add(new pair(nr,nc));
}
