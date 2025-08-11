// Last updated: 12/08/2025, 00:12:26
class Solution {
    public int countPairs(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}