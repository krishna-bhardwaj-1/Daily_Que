// Last updated: 12/08/2025, 00:17:45
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) c++;
            else{
                max=Math.max(max,c);
                c=0;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}