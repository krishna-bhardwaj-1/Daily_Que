// Last updated: 12/08/2025, 00:17:04
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
            }
            else{
                max=Math.max(max,c);
                c=1;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}