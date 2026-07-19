class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[]visited=new boolean[n];
int prov=0;
        for(int city=0;city<n;city++){
            if(!visited[city]){
                dfs(city,isConnected,visited);
                prov++;
            }
        }return prov;
    }
    void dfs(int city, int[][]isConnected,boolean[]visited){
        visited[city]=true;
        for(int neigh=0;neigh<isConnected.length;neigh++){
            if(isConnected[city][neigh]==1&&!visited[neigh]){
                dfs(neigh,isConnected,visited);
            }
        }
    }
}