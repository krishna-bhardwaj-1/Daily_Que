// Last updated: 12/08/2025, 00:21:04
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int maxreach=nums[0];
        int lastindex=nums.length-1;
        for(int i=1;i<=maxreach;i++){
            if(maxreach>=lastindex){
                return true;
            }
            else{
                maxreach=Math.max(maxreach,nums[i]+i);
            }
        }
        return false;
    }
}