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

       // int[][]dp=new int[n][m];
       int[] prev=new int[m];
        for(int i=0;i<n;i++){
            int[]curr=new int[m];
            for(int j=0;j<m;j++){
                 //if(i==0 &&j==0){ dp[i][j]=grid[0][0];continue;}
                 if(i==0 &&j==0){ curr[j]=grid[0][0];continue;}
                 int up=(int)1e9;
                 int left=(int)1e9;
                 if(i>0){
                     up=grid[i][j] + prev[j];
                 }
                 if(j>0){
                    left=grid[i][j]+curr[j-1];
                 }
                  curr[j]=Math.min(up,left);
            }prev=curr;
          

        }
          //return dp[n-1][m-1];
          return prev[m-1];
    //     for(int[]row : dp){
    //     Arrays.fill(row,-1);}
    //     return solve(n-1,m-1,grid,dp);
    // }
}
}