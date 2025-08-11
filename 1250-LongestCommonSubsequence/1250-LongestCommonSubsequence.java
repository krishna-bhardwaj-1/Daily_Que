// Last updated: 12/08/2025, 00:15:27
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(text1,text2,text1.length() ,text2.length(),dp));
    }
    private static int sol(String s1,String s2,int n,int m,int[][] dp){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return 1+sol(s1,s2,n-1,m-1,dp);
        }
        int c1=sol(s1,s2,n-1,m,dp);
        int c2=sol(s1,s2,n,m-1,dp);
        return dp[n][m]=Math.max(c1,c2);
    }
}