// Last updated: 12/08/2025, 00:15:53
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int c=nums.length-1;
        int b=nums.length-2;
        int a=nums.length-3;
        while(c>=2){
            if(((nums[a]+nums[b])>nums[c]) && ((nums[a]+nums[c])>nums[b]) && ((nums[b]+nums[c])>nums[a])){
                return nums[a]+nums[b]+nums[c];
            }
            else{
                c--;
                b--;
                a--;
            }
        }
        return 0;
    }
}