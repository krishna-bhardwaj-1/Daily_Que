// Last updated: 12/08/2025, 00:13:01
class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>nums[i]){
                max=Math.max(max,nums[j]-nums[i]);
            }
            else{
                i=j;
            }
        }
        return max;
    }
}