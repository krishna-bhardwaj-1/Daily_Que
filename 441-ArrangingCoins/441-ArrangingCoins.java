// Last updated: 12/08/2025, 00:17:57
class Solution {
    public int arrangeCoins(int n) {
        int lo=0;
        int hi=n;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            long e=n-((mid*(mid+1))/2);
            if(e==0){
                return (int)mid;
            }
            else if(e<0){
                hi=(int)mid-1;
            }
            else{
                lo=(int)mid+1;
            }
        }
        return hi;
    }
}