// Last updated: 12/08/2025, 00:08:55
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++){
            while(nums[j]>((long) nums[i]*k)){
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return nums.length-max;
    }
}