// Last updated: 12/08/2025, 00:09:53
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        int idx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[idx]=nums[i];
                idx++;
            }
        }
        return arr;
    }
}