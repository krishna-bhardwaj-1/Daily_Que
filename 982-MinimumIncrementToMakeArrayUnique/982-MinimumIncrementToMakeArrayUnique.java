// Last updated: 12/08/2025, 00:16:04
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int max=nums[0];
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(max>=nums[i]){
                cnt+=(max-nums[i]+1);
                max+=1;
            }
            else{
                max=nums[i];
            }
        }
        return cnt;
    }
}