
class Solution {
    int[][]dp;
    public boolean solve(int i, int target, int []nums){
        if(target==0)return true;
        if(i==nums.length)return false;
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
        }
        boolean take=false;
        if(nums[i]<=target){
            take=solve(i+1,target-nums[i],nums);
        }
        boolean nottake=solve(i+1,target,nums);
         dp[i][target]=(take||nottake)?1:0;
        return take||nottake;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2==1)return false;
        dp=new int[nums.length][sum/2+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        return solve(0,sum/2,nums);
    }
}