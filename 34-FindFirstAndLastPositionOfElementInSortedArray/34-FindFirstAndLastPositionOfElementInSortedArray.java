// Last updated: 12/08/2025, 00:21:28
class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]<target){
                i++;
            }
            else if(nums[j]>target){
                j--;
            }
            else {
                return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
}