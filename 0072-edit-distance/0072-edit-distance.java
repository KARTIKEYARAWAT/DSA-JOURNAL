class Solution {
    public int solve(int i, int j, String s1, String s2, int[][]dp){
        if(i==s1.length())return s2.length()-j;
        if(j==s2.length())return s1.length()-i;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]=solve(i+1,j+1,s1,s2,dp);
        int insert=solve(i,j+1,s1,s2,dp);
        int delete=solve(i+1,j,s1,s2,dp);
        int replace=solve(i+1,j+1,s1,s2,dp);
        return dp[i][j]=1+Math.min(insert, Math.min(delete, replace));
    }
    public int minDistance(String word1, String word2) {
       int n=word1.length();
       int m=word2.length();
       int [][]dp=new int[n][m];
       for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
       }
       return solve(0,0,word1,word2,dp);
    }
}