// Last updated: 12/08/2025, 00:15:31
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums=new int[arr.length];
        nums[nums.length-1]=-1;
        for(int i=nums.length-2;i>=0;i--){
            nums[i]=Math.max(nums[i+1],arr[i+1]);
        }
        return nums;
    }
}