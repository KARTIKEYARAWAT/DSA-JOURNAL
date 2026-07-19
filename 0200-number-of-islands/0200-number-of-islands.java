class Solution {
     int[] dr={-1,1,0,0};
    int[]dc={0,0,-1,1};
    public int numIslands(char[][] grid) {
       int islands=0;
       int rows=grid.length;
       int cols=grid[0].length;
       for(int row=0;row<rows;row++){
        for(int col=0;col<cols;col++){
            if(grid[row][col]=='1'){
                dfs(grid,row,col);
                islands++;
            }
        }
       }return islands;
    }
    public void dfs(char [][]grid,int row, int col)
    {
        if(row<0 || row>=grid.length || 
        col<0 ||col>=grid[0].length ||
        grid[row][col]=='0')return ;

        grid[row][col]='0';

        for(int d=0;d<4;d++){
            int newr=row+dr[d];
            int newc=col+dc[d];
            dfs(grid,newr,newc);
        }
    }
}