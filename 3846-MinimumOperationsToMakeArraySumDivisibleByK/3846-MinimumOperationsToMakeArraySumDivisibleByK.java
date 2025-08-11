// Last updated: 12/08/2025, 00:09:05
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums) sum+=i;
        return sum%k;
    }
}