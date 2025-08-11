// Last updated: 12/08/2025, 00:09:35
class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==(nums[i-1]+nums[i+1])*2){
                c++;
            }
        }
        return c;
    }
}