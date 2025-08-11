// Last updated: 12/08/2025, 00:10:38
class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        long[] pre=new long[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }

        long[] suf=new long[nums.length];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=suf.length-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],nums[i]);
        }

        for(int i=1;i<nums.length-1;i++){
            ans=Math.max(ans,(pre[i-1]-nums[i])*suf[i+1]);
        }
        return ans;
    }
}