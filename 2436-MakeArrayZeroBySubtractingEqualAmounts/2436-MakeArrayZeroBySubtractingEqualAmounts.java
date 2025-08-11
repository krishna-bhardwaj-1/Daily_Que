// Last updated: 12/08/2025, 00:12:02
class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && nums[i]==0){
            i++;
        }
        int op=0;
        while(nums[nums.length-1]>0){
            int x=nums[i];
            if(x>0){
                for(int c=i;c<nums.length;c++){
                    nums[c]-=x;
                }
                op++;
            }
            i++;
        }
        return op;
    }
}