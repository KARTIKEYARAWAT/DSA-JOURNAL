class Solution {
    public boolean dfs(int current,int destination, ArrayList<ArrayList<Integer>>adj,boolean[]visited){
        if(current==destination)return true;
        visited[current]=true;
        for(int neigh:adj.get(current)){
            if(!visited[neigh]){
                if(dfs(neigh,destination,adj,visited))return true;
            }
        }return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        return dfs(source,destination,adj,visited);
        
    }
}