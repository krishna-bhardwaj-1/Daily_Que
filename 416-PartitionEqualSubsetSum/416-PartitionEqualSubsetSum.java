// Last updated: 12/08/2025, 00:18:01
class Solution {
    public boolean canPartition(int[] nums) {
        int x=sum(nums);
        if(x%2!=0) return false;
        Boolean[][] dp=new Boolean[nums.length][x/2+1];
        return helper(nums,0,0,x/2,dp);
    }
    private static boolean helper(int[] arr,int idx,int curr,int sum,Boolean[][] dp){
        if(idx==arr.length || curr>sum){
            return false;
        }
        if(curr==sum ) return true;
        if(Objects.nonNull(dp[idx][curr])) return dp[idx][curr];
        boolean a=helper(arr,idx+1,curr+arr[idx],sum,dp);
        boolean b=helper(arr,idx+1,curr,sum,dp);
        return dp[idx][curr]=a||b;
    }
    private static int sum(int[] arr){
        int s=0;
        for(int i:arr) s+=i;
        return s;
    }
}