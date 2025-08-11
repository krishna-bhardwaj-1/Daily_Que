// Last updated: 12/08/2025, 00:14:36
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last=nums[nums.length-1];
        int seclast=nums[nums.length-2];
        return (last-1)*(seclast-1);
    }
}