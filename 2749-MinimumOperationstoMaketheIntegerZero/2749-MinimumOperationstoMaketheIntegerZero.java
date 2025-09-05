// Last updated: 06/09/2025, 00:15:53
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k=1;k<=60;k++){
            // n1-k[2^i+n2]=0;  --> n1-kn2=k*2^i;
            long diff=(long)num1-(long)k*num2;
            if(diff<0) continue;

            int bits=Long.bitCount(diff);

            if(bits<=k && diff>=k){
                return k;
            }
        }
        return -1;
    }
}