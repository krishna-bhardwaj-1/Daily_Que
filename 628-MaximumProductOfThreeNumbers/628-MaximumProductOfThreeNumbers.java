// Last updated: 12/08/2025, 00:17:11
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return Math.max(nums[n]*nums[n-1]*nums[n-2],nums[n]*nums[0]*nums[1]);
    }
}