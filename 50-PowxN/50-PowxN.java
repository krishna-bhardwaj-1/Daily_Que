// Last updated: 12/08/2025, 00:21:11
class Solution {
    public double myPow(double x, int n) {
        long binform=n;
        if(n==0) return 1;
        if(n==1) return x;
        if(x==0) return 0;
        if(x==1) return 1;
        if(x==-1 && n%2==0) return 1;
        if(x==-1 && n%2!=0) return -1;
        if(n<0){
            binform=-binform;
            x=1/x;
        }
        double ans=1;
        while(binform>0){
            if(binform%2==1){
                ans*=x;
            }
            x*=x;
            binform/=2;
        }
        return ans;
    }
}