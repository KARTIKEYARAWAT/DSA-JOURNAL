class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
        }
        int []indegree=new int [numCourses];
        for(int i=0;i<numCourses;i++){
        for(int neigh:adj.get(i)){
            indegree[neigh]++;
        }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int []order=new int[numCourses];
        int index=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            order[index++]=curr;
            for(int neigh:adj.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }if(index==numCourses){
            return order;
        }
        return new int[0];//cycle exist

    }
}