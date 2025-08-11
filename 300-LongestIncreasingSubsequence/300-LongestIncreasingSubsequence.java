// Last updated: 12/08/2025, 00:18:33
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length+1][nums.length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(recursive(nums,0,-1,nums.length,dp));
    }
    private static int recursive(int[] nums,int curr,int prev,int n,int[][] dp){
        int inc=0,exc=0;
        if(curr==n){
            return 0;
        }
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        if(prev==-1||nums[curr]>nums[prev]){
            inc=1+recursive(nums,curr+1,curr,n,dp);
        }
        exc=recursive(nums,curr+1,prev,n,dp);
        dp[curr][prev+1]=Math.max(inc,exc);
        return Math.max(inc,exc);
    }
}