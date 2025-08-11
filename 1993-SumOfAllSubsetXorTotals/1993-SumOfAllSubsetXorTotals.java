// Last updated: 12/08/2025, 00:13:31
class Solution {
    static int totsum;
    public int subsetXORSum(int[] nums) {
        totsum=0;
        subset(0,nums,0);
        return totsum;
    }
    private static void subset(int idx,int[] nums,int ans){
        if(idx==nums.length){
            totsum+=ans;
            return;
        }

        subset(idx+1,nums,ans^nums[idx]);
        subset(idx+1,nums,ans);
    }
}