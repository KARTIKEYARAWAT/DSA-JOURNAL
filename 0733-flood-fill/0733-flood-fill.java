class Solution {
    int rows;
    int cols;
    int originalcolor;
    int newcolor;
    int[]dr={-1,1,0,0};
    int []dc={0,0,-1,1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
        originalcolor=image[sr][sc];
        newcolor=color;
        if(originalcolor==newcolor)return image;
        dfs(image,sr,sc);
        return image;
    }
    public void dfs(int[][]image,int row,int col){
        if(row<0||row>=rows||col<0||col>=cols)return;
        if(image[row][col]!=originalcolor)return;
        image[row][col]=newcolor;
        for(int d=0;d<4;d++){
            int newr=row+dr[d];
            int newc=col+dc[d];
            dfs(image,newr,newc);
        }
    }
}