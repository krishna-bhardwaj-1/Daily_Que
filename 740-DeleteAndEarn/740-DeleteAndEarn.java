// Last updated: 12/08/2025, 00:16:55
class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxE=Integer.MIN_VALUE;
        for(int e:nums){
            maxE=Math.max(maxE,e);
        }
        int[] house=new int[maxE+1];
        for(int e:nums){
            house[e]+=e;
        }
        int[] dp=new int[house.length+1];
        Arrays.fill(dp,-1);
        return maxmoney(house,0,house.length,dp);
    }
    public static int maxmoney(int[] house,int curr,int n,int[] dp){
        if(curr>=n){
            return 0;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        int c1=house[curr]+maxmoney(house,curr+2,n,dp);
        int c2=maxmoney(house,curr+1,n,dp);
        dp[curr]=Math.max(c1,c2);
        return Math.max(c1,c2);
    }
}