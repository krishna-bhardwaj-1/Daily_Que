// Last updated: 12/08/2025, 00:10:04
class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                c++;
            }
        }
        if(nums[nums.length-1]==0 || nums[nums.length-2]==0) return -1;
        return c;
    }
}