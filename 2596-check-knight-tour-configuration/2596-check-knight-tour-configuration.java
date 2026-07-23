class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        int [][]position=new int[n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int move=grid[i][j];
                position[move][0]=i;
                position[move][1]=j;
            }
        }
        if(position[0][0]!=0 || position[0][1]!=0){return false;}
        for(int move = 0; move < n * n - 1; move++) {

    int x1 = position[move][0];
    int y1 = position[move][1];

    int x2 = position[move + 1][0];
    int y2 = position[move + 1][1];

    int dx = Math.abs(x1 - x2);
    int dy = Math.abs(y1 - y2);

    if(!((dx == 2 && dy == 1) ||
         (dx == 1 && dy == 2))) {

        return false;
    }
}return true;
    }
}