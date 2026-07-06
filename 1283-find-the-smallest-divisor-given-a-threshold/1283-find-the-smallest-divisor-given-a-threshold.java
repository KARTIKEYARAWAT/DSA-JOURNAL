class Solution {
    public int calculate(int[] nums, int divisor){
        int sum=0;
        for(int num:nums){
            sum+=((num +divisor-1)/divisor);
        }return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int x:nums){
            high=Math.max(high,x);
        }
        int answer=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=calculate(nums,mid);
            if(sum<=threshold){
                answer=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}