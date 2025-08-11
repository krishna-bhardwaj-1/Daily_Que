// Last updated: 12/08/2025, 00:14:17
class Solution {
    public int minOperations(int[] nums) {
        int c=0; int zero=0;
        while(zero!=nums.length){
            zero=0;
            int i=0;
            for(;i<nums.length;i++){
                if(nums[i]%2!=0) break;
                else if(nums[i]==0) zero++;
            }
            if(zero==nums.length) return c;
            if(i==nums.length){
                c++;
                for(i=0;i<nums.length;i++){
                    nums[i]/=2;
                }
            }
            for(i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                    c++;
                    nums[i]--;
                }
            }
        }
        return c;
    }
}