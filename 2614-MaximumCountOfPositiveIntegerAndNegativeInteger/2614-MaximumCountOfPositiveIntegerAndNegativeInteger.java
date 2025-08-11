// Last updated: 12/08/2025, 00:11:28
class Solution {
    public int maximumCount(int[] nums) {
        int  a=0,b=0;
        for(int i:nums){
            if(i>0) a++;
            else if(i<0) b++;
        }
        return Math.max(a,b);
    }
}