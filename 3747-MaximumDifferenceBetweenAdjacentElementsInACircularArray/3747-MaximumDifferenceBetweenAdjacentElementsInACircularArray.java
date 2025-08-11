// Last updated: 12/08/2025, 00:09:24
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            diff=Math.max(diff,Math.abs(nums[i]-nums[i+1]));
        }
        diff=Math.max(diff,Math.abs(nums[0]-nums[nums.length-1]));
        return diff;
    }
}