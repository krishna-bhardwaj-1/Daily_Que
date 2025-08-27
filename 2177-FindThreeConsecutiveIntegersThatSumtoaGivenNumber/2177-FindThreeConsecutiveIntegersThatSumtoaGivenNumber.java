// Last updated: 27/08/2025, 22:57:56
class Solution {
    public long[] sumOfThree(long num) {
        long[] ans=new long[3];
        if((num-3)%3!=0){
            return new long[0];
        }
        long n=(num-3)/3;
        ans[0]=n;
        ans[1]=n+1;
        ans[2]=n+2;
        return ans;
    }
}