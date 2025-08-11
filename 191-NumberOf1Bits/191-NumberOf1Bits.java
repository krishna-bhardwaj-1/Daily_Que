// Last updated: 12/08/2025, 00:19:21
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            int rem=n%2;
            if(rem==1){
                c++;
            }
            n/=2;
        }
        return c;
    }
}