// Last updated: 12/08/2025, 00:16:25
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=0;
        int hi=1000000007;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(ispossible(mid,piles,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    private static boolean ispossible(int mid,int[] piles,int h){
        int c=0;
        for(int i=0;i<piles.length;i++){
            c+=Math.ceil((double)piles[i]/mid);
        }
        return c<=h;
    }
}