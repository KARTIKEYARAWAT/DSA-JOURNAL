class Solution {
    public long calculate(int[] piles, int speed){
        long hours=0;
        for(int x:piles){
        hours+=(x+speed-1)/speed;}
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int x:piles){
            high=Math.max(high,x);
        }
        int answer=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=calculate(piles,mid);
            if(hours<=h){
                answer=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
        
    }
}