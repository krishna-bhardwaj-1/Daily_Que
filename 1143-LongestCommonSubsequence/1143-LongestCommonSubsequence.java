// Last updated: 04/09/2025, 10:46:25
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for (int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return LCS(s1,s2,0,0,dp);
    }
    public static int LCS(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length() ||j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+LCS(s1,s2,i+1,j+1,dp);
        }
        else{
            int f=LCS(s1,s2,i+1,j,dp);
            int s=LCS(s1,s2,i,j+1,dp);
            ans=Math.max(f,s);
        }
        return dp[i][j]=ans;
    }
}