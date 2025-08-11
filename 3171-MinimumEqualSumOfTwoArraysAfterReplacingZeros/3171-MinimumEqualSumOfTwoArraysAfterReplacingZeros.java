// Last updated: 12/08/2025, 00:10:35
class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        int zero1=0;
        for(int i:nums1){
            if(i==0){
                sum1++;
                zero1++;
            }
            else sum1+=i;
        }
        long sum2=0;
        int zero2=0;
        for(int i:nums2){
            if(i==0){
                sum2++;
                zero2++;
            }
            else sum2+=i;
        }
        if((sum1<sum2 && zero1==0)||(sum1>sum2 && zero2==0)) return -1;
        return Math.max(sum1,sum2);
    }
}