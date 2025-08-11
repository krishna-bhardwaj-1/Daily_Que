// Last updated: 12/08/2025, 00:10:27
class Solution {
    public String triangleType(int[] nums) {
        if((nums[0]+nums[1])>nums[2] && (nums[1]+nums[2])>nums[0] && (nums[0]+nums[2])>nums[1]){
            if(nums[0]==nums[1] && nums[1]==nums[2]){
                return new String("equilateral");
            }
            else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]){
                return new String("isosceles");
            }
            else{
                return new String("scalene");
            }
        }

        return new String("none");
    }
}