// Last updated: 12/08/2025, 00:17:05
class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(c!=-1) return false;
                c=i;
            }
        }
        return (c==-1||c==0||c==nums.length-2||nums[c-1]<=nums[c+1]||(nums[c]<=nums[c+2]));
    }
}