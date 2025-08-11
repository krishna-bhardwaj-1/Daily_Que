// Last updated: 12/08/2025, 00:10:31
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        long ans=0;
        int c=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]==max) c++;
            while(c==k){
                if(nums[l]==max) c--;
                l++;
            }
            ans+=l;
            r++;
        }
        return ans;
    }
}