// Last updated: 12/08/2025, 00:10:30
class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        int idx=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            arr[idx]=nums[i];
            idx++;
            arr[idx]=nums[i-1];
            idx++;
        }
        return arr;
    }
}