class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int []>q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.add(new int []{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int min=0;
        int [] dr={-1,1,0,0};
        int []dc={0,0,-1,1};
        while(!q.isEmpty()&& fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int []curr=q.poll();
                for(int d=0;d<4;d++){
                    int nr=curr[0]+dr[d];
                    int nc=curr[1]+dc[d];
                    if(nr>=0&&nr<rows&&
                    nc>=0&&nc<cols &&
                    grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.add(new int []{nr,nc});
                    }
                }
            }
            min++;

        }
        return fresh==0?min:-1;
    }
}