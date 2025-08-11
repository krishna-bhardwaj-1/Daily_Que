// Last updated: 12/08/2025, 00:14:02
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int idx=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                while(idx<nums.length && set.contains(nums[i])){
                    set.remove(nums[idx]);
                    sum-=nums[idx++];
                }  
            }
            set.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}