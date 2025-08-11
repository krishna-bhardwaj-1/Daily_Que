// Last updated: 12/08/2025, 00:11:14
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        int[] left=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i]+left[i-1];
        }
        int[] right=new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i]+right[i+1];
        }

        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }
        return arr;
    }
}