// Last updated: 12/08/2025, 00:16:10
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    private int helper(int[] nums,int goal){
        int si=0,ei=0,ans=0,sum=0;
        while(ei<nums.length){
            sum+=nums[ei];
            while(sum>goal && si<=ei){
                sum-=nums[si];
                si++;
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}