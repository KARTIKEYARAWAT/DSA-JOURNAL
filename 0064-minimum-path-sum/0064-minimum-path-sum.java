class Solution {
    // public int solve(int i,int j, int[][] grid,int[][]dp){
    //     if(i==0 &&j==0)return grid[0][0];
    //     if (i<0 || j<0)return (int)1e9;
    //     if(dp[i][j]!=-1)return dp[i][j];


    //     int down=grid[i][j] + solve(i-1,j,grid,dp);
    //     int right=grid[i][j] + solve(i,j-1,grid,dp);
    //     return dp[i][j]=Math.min(down,right);
    // }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(i==0 &&j==0){ dp[i][j]=grid[0][0];continue;}
                 int down=(int)1e9;
                 int right=(int)1e9;
                 if(i>0){
                     down=grid[i][j] + dp[i-1][j];
                 }
                 if(j>0){
                    right=grid[i][j]+dp[i][j-1];
                 }
                  dp[i][j]=Math.min(down,right);
            }
          

        }
          return dp[n-1][m-1];
    //     for(int[]row : dp){
    //     Arrays.fill(row,-1);}
    //     return solve(n-1,m-1,grid,dp);
    // }
}
}