class Solution {
    public boolean solve(int[]position, int m, int dist){
        int count =1;
        int lastpos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastpos>=dist){
                count++;
                lastpos=position[i];
             if(count==m)
             return true;
            }
           
        }return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int answer=0;
        while(low<=high){
            int mid=low+(high-low)/2;
        if(solve(position,m,mid)){
            answer=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }

        }
        return answer;
    }
}