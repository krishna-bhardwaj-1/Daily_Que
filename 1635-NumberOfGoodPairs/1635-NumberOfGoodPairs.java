// Last updated: 12/08/2025, 00:14:25
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}