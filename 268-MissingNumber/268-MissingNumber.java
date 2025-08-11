// Last updated: 12/08/2025, 00:18:40
class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=((nums.length)*(nums.length+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return actualsum-sum;
    }
}