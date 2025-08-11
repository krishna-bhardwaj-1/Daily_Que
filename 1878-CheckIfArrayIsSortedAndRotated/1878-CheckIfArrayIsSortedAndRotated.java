// Last updated: 12/08/2025, 00:13:49
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                c++;
            }
        }
        return c<=1;
    }
}