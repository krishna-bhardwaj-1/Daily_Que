// Last updated: 12/08/2025, 00:17:43
class Solution {
    static int count;
    public int findTargetSumWays(int[] nums, int target) {
        count=0;
        helper(nums,0,target);
        return count;
    }

    private void helper(int[] nums,int idx,int target){
        if(idx==nums.length){
            if(target==0){
                count++;
            }
            return;
        }
        helper(nums,idx+1,target-nums[idx]);
        helper(nums,idx+1,target+nums[idx]);
    }
}