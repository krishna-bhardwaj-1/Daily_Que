// Last updated: 12/08/2025, 00:13:26
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}