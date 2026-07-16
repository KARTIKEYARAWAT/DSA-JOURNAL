class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int []prefix=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefix);
        long sum=0;
        int left=0;
        int right=n-1;
        while(left<right){
            sum+=gcd(prefix[left],prefix[right]);
            left++;
            right--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }return a;
    }
}