// Last updated: 12/08/2025, 00:13:25
class Solution {
    public int countGoodNumbers(long n) {
        long a=binaryexpo(4l,n/2,1l);
        long b=binaryexpo(5l,n-(n/2),1l);
        return (int)((a*b)%1000_000007);
    }

    private static long binaryexpo(long val,long b,long res){
        long mod=1000_000_007;
        while(b>0){
            if(b%2!=0){
                res=(res*val)%mod;
            }
            val=(val*val)%mod;
            b/=2;
        }
        return res;
    }
}