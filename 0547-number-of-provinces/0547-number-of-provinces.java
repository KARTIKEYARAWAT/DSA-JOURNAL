class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int prov=0;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                prov++;
            }
        }return prov;
    }
    public void dfs(int i, int [][]isConnected, boolean[]visited){
        visited[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1&&!visited[j]){
                dfs(j,isConnected,visited);
            }
        }
    }
}