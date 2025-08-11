// Last updated: 12/08/2025, 00:16:15
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[idx];
                nums[idx++]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
}