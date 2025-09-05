// Last updated: 05/09/2025, 20:26:17
class Solution {
    public int rob(int[] nums) {
        // int[] dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        // return helper(nums,0,dp);
        return RobberBU(nums);
    }
    // private int helper(int[] arr,int curr,int[] dp){
    //     if(curr>=arr.length){
    //         return 0;
    //     }
    //     if(dp[curr]!=-1){
    //         return dp[curr];
    //     }
    //     int c1=arr[curr]+helper(arr,curr+2,dp);
    //     int c2=helper(arr,curr+1,dp);

    //     return dp[curr]=Math.max(c1,c2);
    // }

    private int RobberBU(int[] arr){
        if(arr.length==1) return arr[0];
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            int c1=arr[i]+dp[i-2];
            int c2=dp[i-1];
            dp[i]=Math.max(c1,c2);
        }
        return dp[dp.length-1];
    }
}