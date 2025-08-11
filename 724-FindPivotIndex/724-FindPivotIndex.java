// Last updated: 12/08/2025, 00:16:58
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int stsum=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(stsum==sum){
                return i;
            }
            stsum+=nums[i];
        }
        return -1;
    }
}