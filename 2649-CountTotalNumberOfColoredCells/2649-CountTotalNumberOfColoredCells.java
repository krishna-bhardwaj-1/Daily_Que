// Last updated: 12/08/2025, 00:11:19
class Solution {
    public long coloredCells(int n) {
        // return helper(0,n,0);
        return 1+(long)2*n*(n-1);
    }
    // public static long helper(int si,int n,long ans){
    //     if(si==n){
    //         return ans;
    //     }
    //     if(si==0){
    //         return helper(si+1,n,ans+1);
    //     }
    //     else{
    //         return helper(si+1,n,ans+(si*4));
    //     }
    // }
}