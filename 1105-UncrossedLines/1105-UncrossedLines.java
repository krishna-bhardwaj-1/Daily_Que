// Last updated: 12/08/2025, 00:15:46
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length+1][nums2.length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(nums1,nums2,nums1.length,nums2.length,dp));
    }
    private int sol(int[] s,int[] t,int n,int m,int[][] dp){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s[n-1]==t[m-1]){
            return 1+sol(s,t,n-1,m-1,dp);
        }
        int c1=sol(s,t,n-1,m,dp);
        int c2=sol(s,t,n,m-1,dp);
        return dp[n][m]=Math.max(c1,c2);
    }
}