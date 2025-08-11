// Last updated: 12/08/2025, 00:12:55
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}