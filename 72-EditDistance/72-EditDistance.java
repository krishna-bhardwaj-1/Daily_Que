// Last updated: 12/08/2025, 00:20:45
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(word1,word2,word1.length(),word2.length(),dp));
    }
    private int sol(String s1,String s2,int n,int m,int[][] dp){
        if(n==0 && m==0){
            return 0;
        }
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return sol(s1,s2,n-1,m-1,dp);
        }
        int c1=sol(s1,s2,n,m-1,dp);
        int c2=sol(s1,s2,n-1,m-1,dp);
        int c3=sol(s1,s2,n-1,m,dp);
        return dp[n][m]=1+Math.min(c1,Math.min(c2,c3));
    }
}